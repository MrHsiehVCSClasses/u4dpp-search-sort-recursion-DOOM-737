package u4cpp;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortTests {

    private int[] array = {2, 4, 1, -1, 0, 9, -80, 3};
    private ArrayList<Integer> list;
    private int[] longArray;
    private int[] longArrayCorrect;
    private ArrayList<Integer> longList;
    private ArrayList<Integer> longListCorrect;
    private final int LONG_ARRAY_LENGTH = 100;

    @BeforeEach
    public void setup() {
        list = new ArrayList<Integer>();
        list.add(2);
        list.add(4);
        list.add(1);
        list.add(-1);
        list.add(0); 
        list.add(9); 
        list.add(-80);
        list.add(3);

        // fill longArray & longList with random values
        longList = new ArrayList<Integer>();
        longArray = new int[LONG_ARRAY_LENGTH];
        longArrayCorrect = new int[LONG_ARRAY_LENGTH];
        for(int i = 0; i < LONG_ARRAY_LENGTH; i++) {
            int x = (int)(Math.random() * 1000);
            longArray[i] = x;
            longArrayCorrect[i] = x;
            longList.add(x);
        }
        Arrays.sort(longArrayCorrect);
        
        longListCorrect = new ArrayList<Integer>(longList);
        Collections.sort(longListCorrect);
        Collections.reverse(longListCorrect);
    } 

    // ==================== SELECTION SORT - ARRAY TESTS ====================

    @Test
    public void selectionSort_WhenArrayIsEmpty_ShouldReturnAnEmptyArray() 
    {
        array = new int[0];
        int[] sortedArray = Sort.selectionSort(array);

        assertEquals(0, sortedArray.length);
    }

    @Test
    public void selectionSort_WhenArrayHasAllIdenticalElements_ShouldReturnArrayUnchanged()
    {
        int[] identicalArray = {5, 5, 5, 5, 5};
        int[] sortedArray = Sort.selectionSort(identicalArray);

        assertArrayEquals(identicalArray, sortedArray);
    }

    @Test
    public void selectionSort_WhenArrayAlreadySorted_ShouldReturnCorrectlySortedArray()
    {
        int[] alreadySorted = {-5, -2, 0, 3, 8};
        int[] sortedArray = Sort.selectionSort(alreadySorted);

        int[] expected = {-5, -2, 0, 3, 8};
        assertArrayEquals(expected, sortedArray);
    }

    @Test
    public void selectionSort_WhenArrayIsUnsorted_ShouldReturnAnAscendingSortedArray()
    {
        int[] correctArray = {-80, -1, 0, 1, 2, 3, 4, 9};
        int[] sortedArray = Sort.selectionSort(array);

        assertArrayEquals(correctArray, sortedArray);
    }

    @Test
    public void selectionSort_WhenLongArrayIsUnsorted_ShouldReturnAnAscendingSortedArray()
    {
        int[] sortedArray = Sort.selectionSort(longArray);

        assertArrayEquals(longArrayCorrect, sortedArray);
    }

    @Test
    public void selectionSort_WhenCalledWithArray_ShouldNotModifyTheParameter()
    {
        int[] correctArray = {2, 4, 1, -1, 0, 9, -80, 3};
        Sort.selectionSort(array);

        assertArrayEquals(correctArray, array);
    }

    // ==================== SELECTION SORT - ARRAYLIST TESTS ====================

    @Test
    public void selectionSort_WhenListIsEmpty_ShouldReturnAnEmptyList() 
    {
        list = new ArrayList<Integer>();
        ArrayList<Integer> sortedList = Sort.selectionSort(list);

        assertEquals(0, sortedList.size());
    }

    @Test
    public void selectionSort_WhenListHasAllIdenticalElements_ShouldReturnListUnchanged()
    {
        ArrayList<Integer> identicalList = new ArrayList<>();
        identicalList.add(5);
        identicalList.add(5);
        identicalList.add(5);

        ArrayList<Integer> sortedList = Sort.selectionSort(identicalList);
        assertEquals(identicalList, sortedList);
    }

    @Test
    public void selectionSort_WhenListAlreadySortedDescending_ShouldReturnCorrectlySortedList()
    {
        ArrayList<Integer> descendingList = new ArrayList<>();
        descendingList.add(8);
        descendingList.add(3);
        descendingList.add(0);
        descendingList.add(-2);
        descendingList.add(-5);

        ArrayList<Integer> sortedList = Sort.selectionSort(descendingList);

        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(8);
        expected.add(3);
        expected.add(0);
        expected.add(-2);
        expected.add(-5);
        assertEquals(expected, sortedList);
    }

    @Test
    public void selectionSort_WhenListIsUnsorted_ShouldReturnADescendingSortedList()
    {
        ArrayList<Integer> correctList = new ArrayList<Integer>();
        correctList.add(9);
        correctList.add(4);
        correctList.add(3);
        correctList.add(2);
        correctList.add(1);
        correctList.add(0);
        correctList.add(-1);
        correctList.add(-80);

        ArrayList<Integer> sortedList = Sort.selectionSort(list);

        assertEquals(correctList, sortedList);
    }

    @Test
    public void selectionSort_WhenLongListIsUnsorted_ShouldReturnADescendingSortedList()
    {
        ArrayList<Integer> sortedList = Sort.selectionSort(longList);

        assertEquals(longListCorrect, sortedList);
    }

    @Test
    public void selectionSort_WhenCalledWithList_ShouldNotModifyTheParameter()
    {
        ArrayList<Integer> correctList = new ArrayList<Integer>(list);
        
        Sort.selectionSort(list);

        assertEquals(correctList, list);
    }

    // ==================== INSERTION SORT - ARRAY TESTS ====================

    @Test
    public void insertionSort_WhenArrayIsEmpty_ShouldReturnAnEmptyArray() 
    {
        array = new int[0];
        int[] sortedArray = Sort.insertionSort(array);

        assertEquals(0, sortedArray.length);
    }

    @Test
    public void insertionSort_WhenArrayHasAllIdenticalElements_ShouldReturnArrayUnchanged()
    {
        int[] identicalArray = {7, 7, 7, 7};
        int[] sortedArray = Sort.insertionSort(identicalArray);

        assertArrayEquals(identicalArray, sortedArray);
    }

    @Test
    public void insertionSort_WhenArrayReverseSorted_ShouldReturnCorrectlySortedArray()
    {
        int[] reverseSorted = {9, 7, 5, 3, 1};
        int[] sortedArray = Sort.insertionSort(reverseSorted);

        int[] expected = {1, 3, 5, 7, 9};
        assertArrayEquals(expected, sortedArray);
    }

    @Test
    public void insertionSort_WhenArrayIsUnsorted_ShouldReturnAnAscendingSortedArray()
    {
        int[] correctArray = {-80, -1, 0, 1, 2, 3, 4, 9};
        int[] sortedArray = Sort.insertionSort(array);
        assertArrayEquals(correctArray, sortedArray);
    }

    @Test
    public void insertionSort_WhenLongArrayIsUnsorted_ShouldReturnAnAscendingSortedArray()
    {
        int[] sortedArray = Sort.insertionSort(longArray);

        assertArrayEquals(longArrayCorrect, sortedArray);
    }

    @Test
    public void insertionSort_WhenCalledWithArray_ShouldNotModifyTheParameter()
    {
        int[] correctArray = {2, 4, 1, -1, 0, 9, -80, 3};
        Sort.insertionSort(array);

        assertArrayEquals(correctArray, array);
    }

    // ==================== INSERTION SORT - ARRAYLIST TESTS ====================

    @Test
    public void insertionSort_WhenListIsEmpty_ShouldReturnAnEmptyList() 
    {
        list = new ArrayList<Integer>();
        ArrayList<Integer> sortedList = Sort.insertionSort(list);

        assertEquals(0, sortedList.size());
    }

    @Test
    public void insertionSort_WhenListHasAllIdenticalElements_ShouldReturnListUnchanged()
    {
        ArrayList<Integer> identicalList = new ArrayList<>();
        identicalList.add(7);
        identicalList.add(7);
        identicalList.add(7);

        ArrayList<Integer> sortedList = Sort.insertionSort(identicalList);
        assertEquals(identicalList, sortedList);
    }

    @Test
    public void insertionSort_WhenListIsAscendingShouldReturnDescending_ShouldReturnCorrectly()
    {
        ArrayList<Integer> ascendingList = new ArrayList<>();
        ascendingList.add(1);
        ascendingList.add(3);
        ascendingList.add(5);
        ascendingList.add(7);
        ascendingList.add(9);

        ArrayList<Integer> sortedList = Sort.insertionSort(ascendingList);

        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(9);
        expected.add(7);
        expected.add(5);
        expected.add(3);
        expected.add(1);
        assertEquals(expected, sortedList);
    }

    @Test
    public void insertionSort_WhenListIsUnsorted_ShouldReturnADescendingSortedList()
    {
        ArrayList<Integer> correctList = new ArrayList<Integer>();
        correctList.add(9);
        correctList.add(4);
        correctList.add(3);
        correctList.add(2);
        correctList.add(1);
        correctList.add(0);
        correctList.add(-1);
        correctList.add(-80);

        ArrayList<Integer> sortedList = Sort.insertionSort(list);

        assertEquals(correctList, sortedList);
    }

    @Test
    public void insertionSort_WhenLongListIsUnsorted_ShouldReturnADescendingSortedList()
    {
        ArrayList<Integer> sortedList = Sort.insertionSort(longList);

        assertEquals(longListCorrect, sortedList);
    }

    @Test
    public void insertionSort_WhenCalledWithList_ShouldNotModifyTheParameter()
    {
        ArrayList<Integer> correctList = new ArrayList<Integer>(list);
        
        Sort.insertionSort(list);

        assertEquals(correctList, list);
    }

    // ==================== MERGE SORT - ARRAYLIST TESTS ====================

    @Test
    public void mergeSort_WhenListIsEmpty_ShouldReturnAnEmptyList() 
    {
        list = new ArrayList<Integer>();
        ArrayList<Integer> sortedList = Sort.mergeSort(list);

        assertEquals(0, sortedList.size());
    }

    @Test
    public void mergeSort_WhenListHasAllIdenticalElements_ShouldReturnListUnchanged()
    {
        ArrayList<Integer> identicalList = new ArrayList<>();
        identicalList.add(3);
        identicalList.add(3);
        identicalList.add(3);

        ArrayList<Integer> sortedList = Sort.mergeSort(identicalList);
        assertEquals(identicalList, sortedList);
    }

    @Test
    public void mergeSort_WhenListHasOnlyNegativeNumbers_ShouldReturnCorrectlySortedList()
    {
        ArrayList<Integer> negativeList = new ArrayList<>();
        negativeList.add(-5);
        negativeList.add(-1);
        negativeList.add(-10);
        negativeList.add(-3);

        ArrayList<Integer> sortedList = Sort.mergeSort(negativeList);

        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(-10);
        expected.add(-5);
        expected.add(-3);
        expected.add(-1);

        assertEquals(expected, sortedList);
    }

    @Test
    public void mergeSort_WhenListIsUnsorted_ShouldReturnAnAscendingSortedList()
    {
        ArrayList<Integer> correctList = new ArrayList<Integer>();
        correctList.add(-80);
        correctList.add(-1);
        correctList.add(0);
        correctList.add(1);
        correctList.add(2);
        correctList.add(3);
        correctList.add(4);
        correctList.add(9);

        ArrayList<Integer> sortedList = Sort.mergeSort(list);

        assertEquals(correctList, sortedList);
    }

    @Test
    public void mergeSort_WhenLongListIsUnsorted_ShouldReturnAnAscendingSortedList()
    {
        ArrayList<Integer> longListExpected = new ArrayList<Integer>(longList);
        Collections.sort(longListExpected);
        ArrayList<Integer> sortedList = Sort.mergeSort(longList);

        assertEquals(longListExpected, sortedList);
    }

    @Test
    public void mergeSort_WhenCalledWithList_ShouldNotModifyTheParameter()
    {
        ArrayList<Integer> correctList = new ArrayList<Integer>(list);
        
        Sort.mergeSort(list);

        assertEquals(correctList, list);
    }
    
}