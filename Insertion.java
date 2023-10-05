package ie.atu.sw;

public class Insertion {
	
	public static void insertionSort (int[] unsortedArray) { // main source of code https://www.geeksforgeeks.org/insertion-sort/ + video https://www.youtube.com/watch?v=JU767SDMDvA and https://www.youtube.com/watch?v=jDM6_TnYIqE 
			for (int i = 1; i < unsortedArray.length; i++) {
				int current = unsortedArray[i];
				int j=i-1; //declare j as the previous item from i
				while (j>=0 && current<unsortedArray [j]) { // check if j more than 0 and more than current value 
					unsortedArray [j+1]=unsortedArray[j]; //declare next item as new item
					j--; // moving from right to left
				}
				unsortedArray [j+1]=current; // declare that next item is new current value that is checking
				}
				
			}
			
		 
	    void printInsertionArray(int arr[])
	    {
	        int n = arr.length;
	        for (int i = 0; i < n; ++i)
	            System.out.print(arr[i] + " ");
	 
	        System.out.println();
	    }

}
