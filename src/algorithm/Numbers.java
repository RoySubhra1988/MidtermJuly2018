package algorithm;

import databases.ConnectToSqlDB;

import java.util.List;
import java.util.Random;

/*
 *Created by mrahman on 04/02/2018.
 */
public class Numbers {

	/*
	 * Show all the different kind of sorting algorithm by applying into (num array).
	 * Display the execution time for each sorting.Example in below.
	 *
	 * Use any databases[MongoDB, Oracle or MySql] to store data and retrieve data.
	 *
	 * At the end. After running all the sorting algo, come to a conclusion which one is suitable on given data set.
	 *
	 */

	public static void main(String[] args) throws Exception {
		
		int [] num = new int[100];
		storeRandomNumbers(num);
		ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
		//Selection Sort
		Sort algo = new Sort();
		algo.selectionSort(num);
		long selectionSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of "+ num.length + " numbers in Selection Sort take: " + selectionSortExecutionTime + " milli sec");
        connectToSqlDB.insertDataFromArrayToSqlTable(num, "Selection_sort", "SortingNumbers");
        List<String> numbers = connectToSqlDB.readDataBase("Selection_sort", "SortingNumbers");
        printValue(numbers);
		int n = num.length;
		randomize (num, n);
		//Insertion Sort
		algo.insertionSort(num);
		long insertionSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Insertion Sort take: " + insertionSortExecutionTime + " milli sec");
		connectToSqlDB.insertDataFromArrayToSqlTable(num, "Insertion_sort", "SortingNumbers");
		numbers = connectToSqlDB.readDataBase("Insertion_sort", "SortingNumbers");
		//By following above, Continue for rest of the Sorting Algorithm....

		printValue(numbers);
		randomize (num, n);

		//bubble sort
		algo.bubbleSort(num);
		long bubbleSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Bubble Sort take: " + bubbleSortExecutionTime + " milli sec");
		connectToSqlDB.insertDataFromArrayToSqlTable(num, "Bubble_sort", "SortingNumbers");
		numbers = connectToSqlDB.readDataBase("Bubble_sort", "SortingNumbers");
		printValue(numbers);
		randomize (num, n);

		//Heap Sort
		algo.heapSort(num);
		long heapSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Heap Sort take: " + heapSortExecutionTime + " milli sec");
		connectToSqlDB.insertDataFromArrayToSqlTable(num, "Heap_sort", "SortingNumbers");
		numbers = connectToSqlDB.readDataBase("Heap_sort", "SortingNumbers");
		printValue(numbers);
		randomize (num, n);

		//Bucket sort
		algo.bucketSort(num);
		long bucketSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in bucket Sort take: " + bucketSortExecutionTime + " milli sec");
		connectToSqlDB.insertDataFromArrayToSqlTable(num, "Bucket_sort", "SortingNumbers");
		numbers = connectToSqlDB.readDataBase("Bucket_sort", "SortingNumbers");
		printValue(numbers);
		randomize (num, n);

		//quick sort
		int low= 0;
		int high = num.length-1;
		algo.quickSort(num, low, high);
		long quickSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Quick Sort take: " + quickSortExecutionTime + " milli sec");
		connectToSqlDB.insertDataFromArrayToSqlTable(num, "quick_sort", "SortingNumbers");
		numbers = connectToSqlDB.readDataBase("quick_sort", "SortingNumbers");
		printValue(numbers);
		randomize (num, n);

		//merge Sort
		algo.MergeSort(num);
		long mergeSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in merge Sort take: " + mergeSortExecutionTime + " milli sec");
		connectToSqlDB.insertDataFromArrayToSqlTable(num, "merge_sort", "SortingNumbers");
		numbers = connectToSqlDB.readDataBase("merge_sort", "SortingNumbers");
		printValue(numbers);
		randomize (num, n);

		//Shell Short
		algo.shellSort(num);
		long shellSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Shell Sort take: " + shellSortExecutionTime + " milli sec");
		connectToSqlDB.insertDataFromArrayToSqlTable(num, "Shell_sort", "SortingNumbers");
		numbers = connectToSqlDB.readDataBase("Shell_sort", "SortingNumbers");
		printValue(numbers);
		randomize (num, n);

		//Come to conclusion about which Sorting Algo is better in given data set.

	}
	public static int findLow(int[] array){
		int low = array[0];
		for(int n: array){
			if(n < low){
				low = n;
			}
		}
		return low;
	}

	public static int findHigh(int[] array){
		int high = array[0];
		for(int n: array){
			if(n > high){
				high = n;
			}
		}
		return high;
	}


	public static void storeRandomNumbers(int [] num){
		Random rand = new Random();
		for(int i=0; i<num.length; i++){
			num[i] = rand.nextInt(100);
		}
	}

	public static void randomize( int arr[], int n)
	{
		Random r = new Random();
		// Start from the last element and swap one by one. We don't
		// need to run for the first element that's why i > 0
		for (int i = n-1; i > 0; i--) {
			int j = r.nextInt(i);
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}
	public static void printValue(List<String> array){
		for(String st:array){
			System.out.println(st);
		}
	}
}
