package us.kardol.sort;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by gkardol on 5/26/16.
 */
public class QuickSortTest {
    private QuickSort quickSort;
    private int[] unsorted;
    private int[] sorted;

    @Before
    public void setUp(){
        quickSort = new QuickSort();
        unsorted = new int[]{1, 3, 2, 6, 5, 4, 9, 7, 8};
        sorted = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
    }

    @Test
    public void testSort(){
//        Arrays.toString(quickSort.sort(unsorted));
        assertArrayEquals(sorted, quickSort.sort(unsorted));
    }
}