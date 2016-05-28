package us.kardol.sort;

import org.junit.Before;
import org.junit.Test;
import us.kardol.sort.InsertionSort;

import static org.junit.Assert.*;

/**
 * Created by gkardol on 5/25/16.
 */
public class InsertionSortTest {
    private InsertionSort insertionSort;
    private int[] numbers;

    @Before
    public void setUp(){
        numbers = new int[]{4, 6, 2, 7, 8, 5, 3, 8};
        insertionSort = new InsertionSort();
    }

    @Test
    public void testSort(){
        assertArrayEquals(insertionSort.sort(numbers), new int[] {2, 3, 4, 5, 6, 7, 8, 8});
    }
}