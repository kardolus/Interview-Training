package us.kardol.sort;

import java.util.Arrays;

public class MergeSort {
    private int[] sorted;

    public int[] sort(int[] array) {
        this.sorted = array;
        mergeSort(0, array.length - 1);
        return sorted;
    }

    private void mergeSort(int lowerIndex, int higherIndex){
        if(lowerIndex < higherIndex){
            int middle = (lowerIndex + higherIndex)/2;
            mergeSort(lowerIndex, middle);
            mergeSort(middle + 1, higherIndex);
            mergeParts(lowerIndex, middle, higherIndex);
        }
    }

    private void mergeParts(int lowerIndex, int middle, int higherIndex) {
        int[] leftArray = Arrays.copyOfRange(sorted, lowerIndex, middle + 1);
        int[] rightArray = Arrays.copyOfRange(sorted, middle + 1, higherIndex + 1);

        int i = 0;
        int j = 0;
        int k = lowerIndex;

        while(i < leftArray.length && j < rightArray.length){
            if(leftArray[i] <= rightArray[j]){
                sorted[k] = leftArray[i];
                i++;
            }else{
                sorted[k] = rightArray[j];
                j++;
            }
            k++;
        }

        if(i <= middle) {
            while(i < leftArray.length){
                sorted[k] = leftArray[i];
                i++;
                k++;
            }
        }else{
            while(j < rightArray.length){
                sorted[k] = rightArray[j];
                j++;
                k++;
            }
        }
    }
}
