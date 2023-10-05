package ie.atu.sw;

public class CountingSort {//main resource: https://www.youtube.com/watch?v=TTnvXY82dtM&t=594s
	
	public static void countingSort (int[] unsortedArray) 
	{
    	// create list (array) of indexes from min to max
		//create array that will hold each number between min and max
		//count number of times each number appearances in our input array
		// write number of appearances of each number for each index
		// fill empty space in count array 0
		//create sumCount array in which add all index to each next
		
		//create number positions, we have number of position from sumCount. the last sum is the number of positions
		// look at sumCount for each item of input
		// put input on that index that is like sumCount for each input item
		//increase sumCount for each number  SOURCE: https://www.youtube.com/watch?v=TTnvXY82dtM 

//find mix and max, it will be our range
int min = unsortedArray[0];
int max = unsortedArray[0];
for (int i = 1; i < unsortedArray.length; i++) {
    if (unsortedArray[i] < min) {
        min = unsortedArray[i];
    }
    if (unsortedArray[i] > max) {
        max = unsortedArray[i];
    }
}

// create an array of indexes from min to max
int[] indexes = new int[max - min + 1];
indexes[0] = min;
for (int i = 1; i < indexes.length; i++) {
    indexes[i] = min + i;
}

// create a count array that will hold the number of times each number appears in our input array
int[] count = new int[max - min + 1];

// count the number of times each number appears in unsortedArray
for (int i = 0; i < unsortedArray.length; i++) {
    for (int j = 0; j < indexes.length; j++) {
        if (unsortedArray[i] == indexes[j]) {
            count[j]++;
            break;
        }
    }
}

// fill empty space in count array with 0s
int[] sumCount = new int[max - min + 1];
sumCount[0] = count[0];
for (int i = 1; i < count.length; i++) {
    sumCount[i] = sumCount[i - 1] + count[i];
}

// create output array that will hold the sorted input array
int[] outputArray = new int[unsortedArray.length];

// sort the input array by looking at the sumCount array for each item of the input
for (int i = unsortedArray.length - 1; i >= 0; i--) {
    int j = unsortedArray[i] - min;
    outputArray[sumCount[j] - 1] = unsortedArray[i];
    sumCount[j]--;
}

// update the input array with the sorted output
for (int i = 0; i < unsortedArray.length; i++) {
    unsortedArray[i] = outputArray[i];
}
}
}
