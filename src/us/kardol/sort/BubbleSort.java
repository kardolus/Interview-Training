package us.kardol.sort;

public class BubbleSort {
    public int[] sort(int[] numbers) {
        for(int i = 0; i < numbers.length - 1; i++){
            pushHighestValueToEnd(numbers, i);
        }
        return numbers;
    }

    private void pushHighestValueToEnd(int[] numbers, int offset) {
        for(int i = 0; i < numbers.length - 1 - offset; i++) {
            int tmp = numbers[i + 1];
            if (numbers[i] > tmp) {
                numbers[i + 1] = numbers[i];
                numbers[i] = tmp;
            }
        }
    }
}
