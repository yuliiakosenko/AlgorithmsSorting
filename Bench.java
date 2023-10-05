package ie.atu.sw;
import java.util.Arrays;

public class Bench {
	public static double calculateAverage(double[] arr) {
	    double sum = 0;
	    for (double num : arr) {
	        sum += num;
	    }
	    return sum / arr.length;
	}
	  
	    public int[] copyArr(int[] src){ //took this part from lecture week 11
	        int[] dest = new int[src.length];
	        System.arraycopy(src, 0, dest, 0, src.length);
	        return dest;
	    }
	    
	    public static int[] randomArray(int n){
	        int[] array = new int[n];
	        for (int i = 0; i< n; i++){
	            array[i] = (int) (Math.random() * 100);
	        }
	        return array;
	    }
	    
	    public void benchmark(int reps){
	        double total = 0;
	        int[] arr = randomArray(10);
	        for (int i = 0; i<reps; i++){
	            int[] cloned = copyArr(arr);   //took this part from lecture week 11
	            long startTime = System.nanoTime();
	            Arrays.sort(cloned);
	            long endTime = System.nanoTime();
	            long timeElapsed = endTime-startTime;
	            double elapsedMillis = timeElapsed/1000000.0;
	            total += elapsedMillis;
	            //System.out.println(Arrays.toString(cloned));

	        }
	      

	    }
	    

	    
	    
	    /////
	    public static void main(String[] args) {
	        int[] sizes = {100, 250, 500, 750, 1000, 1250, 2500, 3750, 5000, 6250, 7500, 8750, 10000}; // Array sizes to test

	        System.out.print("Size\t\t"); // Print table header
	        for (int size : sizes) { // Print the sizes
	            System.out.print(size + "\t");
	        }
	        System.out.println();

	        System.out.print("Bubble\t\t");
	        for (int size : sizes) {    // For-each size loop, reference: https://www.geeksforgeeks.org/for-each-loop-in-java/
	        	// storing the times for each run
	            double[] bubbleSortTimes = new double[10]; //reference: https://stackoverflow.com/questions/5481066/bubble-sort-do-i-need-double-or-int 
	            for (int i = 0; i < 10; i++) {    // Run bubble sort 10 times
	            	 // create an array of the given size
	                int[] bubbleSortArray = randomArray(size);

	                long startTime = System.nanoTime();  // Start timing, references; https://www.tutorialspoint.com/java/lang/system_nanotime.htm , 
	                                                    //https://www.educative.io/answers/what-is-the-systemnanotime-function-in-java,
	                                                    //https://www.geeksforgeeks.org/java-system-nanotime-vs-system-currenttimemillis
	                Bubble.bubbleSort(bubbleSortArray);  // Run bubble sort on the array
	                long endTime = System.nanoTime();   // End timing
	                double bubbleSortTime = (endTime - startTime) / 1_000_000.0;  // Calculate the time taken in milliseconds
 
	                bubbleSortTimes[i] = bubbleSortTime; // Store the time in the array
	            }
	            double averageTime = calculateAverage(bubbleSortTimes); // Calculate the average time
	            System.out.printf("%.3f\t", averageTime);  // Print the average time // https://www.theserverside.com/blog/Coffee-Talk-Java-News-Stories-and-Opinions/How-to-use-Java-printf-to-format-output 
	        }
	        System.out.println();

	        System.out.print("Selection\t"); 
	        for (int size : sizes) {  // Loop through each size
	            double[] selectionSortTimes = new double[10];  // Array to store the times for each run
	            for (int i = 0; i < 10; i++) { // Run selection sort 10 times
	                int[] selectionSortArray = randomArray(size); // Generate a random array of the given size

	                long startTime = System.nanoTime();
	                Selection.selectionSort(selectionSortArray);
	                long endTime = System.nanoTime();
	                double selectionSortTime = (endTime - startTime) / 1_000_000.0;

	                selectionSortTimes[i] = selectionSortTime;  // Store the time in the array
	            }
	            double averageTime = calculateAverage(selectionSortTimes);  // Calculate the average time
	            System.out.printf("%.3f\t", averageTime);  // Print the average time
	        }
	        System.out.println();

	        System.out.print("Insertion\t");
	        for (int size : sizes) {   // Loop through each size
	            double[] insertionSortTimes = new double[10]; // Array to store the times for each run
	            for (int i = 0; i < 10; i++) { // Run insertion sort 10 times
	                int[] insertionSortArray = randomArray(size);  // Generate a random array of the given size

	                long startTime = System.nanoTime();
	                Insertion.insertionSort(insertionSortArray);
	                long endTime = System.nanoTime();
	                double insertionSortTime = (endTime - startTime) / 1_000_000.0;

	                insertionSortTimes[i] = insertionSortTime;
	            }
	            double averageTime = calculateAverage(insertionSortTimes);
	            System.out.printf("%.3f\t", averageTime);
	        }
	        System.out.println();

	        System.out.print("Quick\t\t");
	        for (int size : sizes) {
	            double[] quickSortTimes = new double[10];
	            for (int i = 0; i < 10; i++) {
	                int[] quickSortArray = randomArray(size);
	                long startTime = System.nanoTime();

	                QuickSort.quickSort(quickSortArray, 0, quickSortArray.length - 1);

	                long endTime = System.nanoTime();
	                double quickSortTime = (endTime - startTime) / 1_000_000.0;

	                quickSortTimes[i] = quickSortTime;
	            }
	            double averageTime = calculateAverage(quickSortTimes);
	            System.out.printf("%.3f\t", averageTime);
	        }
	        System.out.println();
	     
	        System.out.print("CountingSort\t");
	        for (int size : sizes) {
	            double[] countingSortTimes = new double[10]; // Array to store the times for each run
	            for (int i = 0; i < 10; i++) {  // Run sort 10 times
	                int[] countingSortArray = randomArray(size);   // Generate a random array of the given size
	                long startTime = System.nanoTime();

	                CountingSort.countingSort(countingSortArray);

	                long endTime = System.nanoTime();
	                double countingSortTime = (endTime - startTime) / 1_000_000.0; // Calculate the time taken in milliseconds

	                countingSortTimes[i] = countingSortTime; // Store the time in the array
	            }
	            double averageTime = calculateAverage(countingSortTimes);
	            System.out.printf("%.3f\t", averageTime);   // Print the average time
	        }
	        System.out.println();
	            
	        }}

		//for tables https://www.theserverside.com/blog/Coffee-Talk-Java-News-Stories-and-Opinions/Java-print-table-format-printf-chart-console-scanner-println-line 
	    //https://www.theserverside.com/blog/Coffee-Talk-Java-News-Stories-and-Opinions/How-to-use-Java-printf-to-format-output 
	

	

