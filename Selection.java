package ie.atu.sw;

public class Selection {
	
	    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) // declare that we are going to check every item in the array. we dont need to check last one because we will not have item to which we should it compare
        {
            int min = i;//make current number as min till we find new min. in first iteration it is first number
            for (int j = i+1; j < n; j++) // starting with the next item after min, this array will be less,without sorted numbers
                if (arr[j] < arr[min])//if current number is less than min value that we have from main loop
                    min = j;//
            int temp = arr[min]; // make new temporary variable, to change value of min
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
 
	
	void printSelectionArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
        System.out.print(arr[i] + " ");
        System.out.println();
    }

	

	

}
