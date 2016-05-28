package us.kardol.sort;

public class QuickSort {

    public int[] sort(int[] array) {
        return sort(array, 0, array.length - 1);
    }

    private int[] sort(int[] array, int low, int high) {
        if(low < high){
            int pivot = partition(array, low, high);
            sort(array, low, pivot - 1);
            sort(array, pivot + 1, high);
        }
        return array;
    }

    private int pivot(int[] array, int high){
        return array[high];
    }

    private int partition(int[] array, int low, int high){
        int pivot = pivot(array, high);
        int i = low - 1;
        for(int j = low; j <= high - 1; j++){
            if(array[j] <= pivot){
                i++;
                exchange(array, i, j);
            }
        }
        exchange(array, i + 1, high);
        return i + 1;
    }

    private int[] exchange(int[] array, int low, int high){
        int tmp = array[high];
        array[high] = array[low];
        array[low] = tmp;
        return array;
    }
}
