package us.kardol.sort;

import org.junit.Before;
import org.junit.Test;
import us.kardol.sort.BubbleSort;

import static org.junit.Assert.*;

public class BubbleSortTest {
    private int[] numbers;
    private BubbleSort bubbleSort;

    @Before
    public void setUp(){
        numbers = new int[]{4, 6, 2, 7, 8, 5, 3, 8};
        bubbleSort = new BubbleSort();
    }

    @Test
    public void testSort(){
        assertArrayEquals(bubbleSort.sort(numbers), new int[] {2, 3, 4, 5, 6, 7, 8, 8});
    }

}