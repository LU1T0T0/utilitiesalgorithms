
public class MergeSort {
	/**
	 * Merge sort algorithm is a "divide and conquer" algorithm that splits the array in left and right halves,
	 * in turn, recursively splits the halves until reaches arrays of 2 elements. Then compares the sizes and sort it in order
	 * 
	 * Average, best and worst case of O(n log n)
	 * 
	 * @param arr
	 */
	
	int count = 0; //global variable to count the number of steps
	public void mergeSort(int[] arr) {
		int l =  arr.length; //length of array
		
		//base case
		if (l < 2) {
			return;
		}
		
		//splitting the array
		int mid =  l/2;
		int[] left = new int [mid]; //left half array
		int[] right = new int [l - mid]; //right half array
		
		//populating the left half array
		for (int i = 0; i < mid; i++) {
			left[i] = arr[i];
			
		}
		
		//populating the right half array
		for (int i = mid; i < l; i++) {
			right[i - mid] = arr[i];
			
		}
		
		//recursively calls 
		mergeSort(left);
		mergeSort(right);
		
		merge(arr, left, right);
	}
	
	public void merge(int[] arr, int[] left, int[] right) {
		int lSize = left.length; //size of the left half array
		int rSize = right.length; //size of the right half array
		
		//comparing the left and right halve arrays
		int i = 0, j = 0, k = 0;
		
		while (i < lSize && j < rSize) {
			//change the operator for decrescent order
			if (left[i] <= right[j]) {
				arr[k] = left[i];
				i++;
				
			} else {
				arr[k] = right[j];
				j++;
			}
			k++;
			
		}
		// cleanup/completing the sorted array
		while (i < lSize) {
			arr[k] = left[i];
			i++;
			k++;
		
		}
		while (j < rSize) {
			arr[k] = right[j];
			j++;
			k++;
	
			
		}
		count++;
	}
	public void printCount() {
		System.out.println("Number of steps :" + count);
	}
}
