
public class ShellSort {

	/**
	 * Sorting method similar to SelectionSort() but it uses gap intervals to sort the elements
	 * of the array when eventually implements a structure similar to Selection sort algorithm
	 * when the gap is i+1 
	 * 
	 * Worst case O(n^2)
	 * Best case Omega(n log n)
	 * Average case Theta(n log n*2)
	 */
	
	int count = 0; //counter for steps
	public void shellSort(int[] arr) {
		  int n = arr.length;
		  
	        // Start with a big gap, then reduce the gap
	        for (int gap = n/2; gap > 0; gap /= 2)
	        {
	            // Do a gapped insertion sort for this gap size.
	            // The first gap elements a[0..gap-1] are already
	            // in gapped order keep adding one more element
	            // until the entire array is gap sorted
	            for (int i = gap; i < n; i += 1)
	            {
	                // add a[i] to the elements that have been gap
	                // sorted save a[i] in temp and make a hole at
	                // position i
	                int temp = arr[i];
	 
	  
	                // shift earlier gap-sorted elements up until
	                // the correct location for a[i] is found
	                int j;
	                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap) {
	                    arr[j] = arr[j - gap];
	                    
	                }
	  
	                // put temp (the original a[i]) in its correct
	                // location
	                arr[j] = temp;
	                count++;
	            }
	        }
		}
	public void printCount() {
		System.out.println("Number of steps :" + count);
	}
}

