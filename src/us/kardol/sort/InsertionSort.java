package us.kardol.sort;

public class InsertionSort {
    public int[] sort(int[] numbers) {
        for(int i = 0; i < numbers.length; i++){
            pushLowestValueToFront(numbers, i);
        }
        return numbers;
    }

    private void pushLowestValueToFront(int[] numbers, int offset){
        for(int i = offset + 1; i < numbers.length; i++){
            int tmp = numbers[offset];
            if(numbers[i] < numbers[offset]){
                numbers[offset] = numbers[i];
                numbers[i] = tmp;
            }
        }
    }
}
