package ie.atu.sw;

import java.util.Arrays;

public class Runner { //this class is made for checking algorithms implementation on my Student number

    public static void main(String args[])
    {
      
        int arr[] = {4, 2, 5, 7, 2, 8};
        Bubble.bubbleSort(arr);
        System.out.println("Bubble Sorted array:");
        System.out.println(Arrays.toString(arr));
        
    
        int arr2[] = {4, 2, 5, 7, 2, 8};
        Selection.selectionSort(arr2);
        System.out.println("Selection Sorted array:");
        System.out.println(Arrays.toString(arr2));
        
      
        int arr3[] = {4, 2, 5, 7, 2, 8};
        Insertion.insertionSort(arr3);
        System.out.println("Insertion Sorted array:");
        System.out.println(Arrays.toString(arr3));
        
        int arr4[] = {4, 2, 5, 7, 2, 8};
        QuickSort.quickSort(arr4, 0, arr4.length - 1);
        System.out.println("Quick Sorted array:");
        System.out.println(Arrays.toString(arr4));
        
        
        int arr5[] = {4, 2, 5, 7, 2, 8};
        CountingSort.countingSort(arr5);
        System.out.println("Counting Sorted array:");
        System.out.println(Arrays.toString(arr5));
    }
}

