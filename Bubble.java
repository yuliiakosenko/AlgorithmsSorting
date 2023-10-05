package ie.atu.sw;

public class Bubble {

	    public static void bubbleSort(int arr[]) //main source of code: https://www.geeksforgeeks.org/bubble-sort/
	    {
	        int n = arr.length; // creating new variable for unsortedArray.length to make code shorter
	        for (int i = 0; i < n - 1; i++) // we use unsortedArray.length -1 because each time the largest number will be at the last index, so we don't need to compare each time the latest index.
	            for (int j = 0; j < n - i - 1; j++) /*Declare another index value of which we are going to change.
	            	                                  we use "- i - 1" to find a number with which we should compare j,
	            	                                  where i - index of the number we a comparing and unsortedArray.length - i - 1 is the number of elements we should check in particular iteration */
	                if (arr[j] > arr[j + 1]) { //checking if current number is bigger than next
	                    int temp = arr[j]; //creating temporary variable for swapping
	                    arr[j] = arr[j + 1]; //replace value with next element
	                    arr[j + 1] = temp;
	                }
	    }
	 
	    // Printing the array 
	    void printBubbleArray(int arr[])
	    {
	        int n = arr.length;
	        for (int i = 0; i < n; ++i)
	        System.out.print(arr[i] + " ");
	        System.out.println();
	    }
}
	   
	


