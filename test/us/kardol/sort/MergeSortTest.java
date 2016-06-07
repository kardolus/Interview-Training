package us.kardol.sort;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class MergeSortTest {
    private MergeSort mergeSort;
    private int[] array;

    @Before
    public void setUp(){
        mergeSort = new MergeSort();
        array = new int[]{1, 2, 67, 6, 8, 3, 77, 3, 3, 2, 100, 5};
    }

    @Test
    public void testSort(){
        System.out.println(Arrays.toString(mergeSort.sort(new int[]{2, 1, 3, 5, 4})));
        int[] expected = {1, 2, 2, 3, 3, 3, 5, 6, 8, 67, 77, 100};
        System.out.println(Arrays.toString(mergeSort.sort(array)));
        assertArrayEquals(expected, mergeSort.sort(array));
    }
}