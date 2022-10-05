
public class InsertionSort {
	
	public static void insertionSort(int[] arr) {
		//walk through the array
		for (int i = 1; i < arr.length; i++) {
			//copy the current value to a temp variable
			int current = arr[i];
			//walking backwards
			int j = i - 1;
			//walk through the array until the value greater that current is reached
			while (j >= 0 && arr[j] > current) {
				//shifting the value
				arr[j+1] = arr[j];
				//decrement the array
				j--;
			}
			//inserting the value to its correct spot
			arr[j+1] =  current;
		}
	
	}

}
