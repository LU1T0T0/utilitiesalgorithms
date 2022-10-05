
public class SelectionSort {
	public void selectionSort(int[] arr) {
		//going through the array
		for(int i = 0; i < arr.length - 1; i++) {
			//set the minimum value
			int min = i;
			for (int j = i + 1; j < arr.length; j++) {
				//when the minumun is greater that the iterated value
				if(arr[min] > arr[j]) {
					min = j;
				}
			}
			//swap
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
	}

}
