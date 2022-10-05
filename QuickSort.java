import java.util.Random;

/**
 * this algorithm choose a random index in the array, calling it
 * the pivot and partitions all the values less then the pivot
 * on the left and the values greater that the pivot on the right,
 * it recursively calls it self to sort all the array moving the pivots
 * 
 * complexity: O(log n);
 *
 */
public class QuickSort {
	
	int count = 0; //counting steps
	
	//method overload
	public void quickSort(int[] arr) {
		quickSorting(arr, 0, arr.length -1);
	}
	
	//quicksort method
	public void quickSorting(int[] arr, int low, int high) {
		 //base case
		if (low >= high) {
			return;
		}
		
		//choosing randomly the pivot
		int randomPivot = new Random().nextInt(high - low) + low;
		
		//assigning the pivot
		// easy implementation
		// int pivot = arr[high];
		int pivot = arr[randomPivot];
		//swapping the pivot to the last element of the array
		swapping(arr, randomPivot, high);
		
		
		
		int lPoint = partition(arr, low, high, pivot);
		 
		//recursively call left partition
		quickSorting(arr, low, lPoint -1);
		
		//recursively call right partition
		quickSorting(arr, lPoint + 1, high);
		
		
		
	}
	private int partition(int[] arr, int low, int high, int pivot) {
		// partitioning to the number lower than the pivot
		// to the left side and higher than the pivot to the
		// right side
		
		int lPoint = low ; //left pointer
		int rPoint = high ; //right pointer
		
		//moving the left and right pointers towards each other
		while (lPoint < rPoint) {
			//pointing until we find a number higher than the pivot, or hit right pointer
			//invert the signs for decrementing order
			while (arr[lPoint] <= pivot && lPoint < rPoint) {
				lPoint++;
			}
			//in turn, moving the right pointer to the left
			while (arr[rPoint] >= pivot && lPoint < rPoint) {
				rPoint--;
			}
			
			//swapping pointers
			swapping(arr, lPoint, rPoint);
		}
		swapping(arr, lPoint, high);
		return lPoint;
	}
	private void swapping(int[] arr, int a, int b) {
		if (a != b) {
			count ++;
			int temp = arr[a];
			arr[a] = arr[b];
			arr[b] = temp;
		}
	}
	
	public void printCount() {
		System.out.println("Number of steps :" + count);
	}
}
