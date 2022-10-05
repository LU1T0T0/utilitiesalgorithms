
public class BubbleSort {
	public void BubbleSort(int[] arr) {
		//conditions
		boolean swap = true;
		
		//going to the array until its sorted
		while(swap) {
			//condition to avoid infinite loop
			swap = false;
			//going through the array swapping the element
			for(int i = 0; i < arr.length - 1; i++) {
				//when greater than previous value
				if (arr[i] > arr[i + 1]) {
					swap = true;
					//create a temporarily variable
					int temp = arr[i];
					//swapping
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			}
		}
	}

}
