package ie.atu.sw;

public class QuickSort { //main source https://www.youtube.com/watch?v=7h1s2SojIRw&t=442s and https://www.youtube.com/watch?v=Hoixgm4-P4M&pp=ygUJUXVpY2tTb3J0
	
	public static void quickSort(int[] arr, int left, int right) { //https://www.baeldung.com/java-quicksort 
	    if (left < right) {
	        int pivot = partition(arr, left, right);
	        quickSort(arr, left, pivot - 1);
	        quickSort(arr, pivot + 1, right);
	    }
	}

	private static int partition(int[] arr, int left, int right) { //This method partitions the array based on the pivot element and returns the pivot index.
		                                                          //It takes the array, the left index, and the right index as parameters.
	    int pivot = arr[right];
	    int i = left - 1;
	    for (int j = left; j < right; j++) {
	        if (arr[j] < pivot) { // check if the current element is smaller than the pivot
	            i++;
	            int temp = arr[i];
	            arr[i] = arr[j];
	            arr[j] = temp;//Swapping of the elements at indices 'i' and 'j' to place the smaller element in its correct position
	        }
	    }
	    int temp = arr[i + 1];
	    arr[i + 1] = arr[right]; 
	    arr[right] = temp;
	    return i + 1;
	}}
