
public class Knapsack {
	
	/** knapsack approach with dynamic programming, bottom up approach 
	@param weight, an array storing the weights of the items
	@param values, an array storing the values of the items
	@param items, the total number of the items
	@param maxWeight, the maximum weight that we can carry on
	@return the optimal set of values for the knapsack
	*/
	public int dynamicKnapsack(int[] weight, int[] values, int items, int maxWeight) {
		//counter for the iterations
		int counter = 0;
		//base case
		if (items <= 0 || maxWeight <= 0) {
			return 0;
		}
		
		//initialize the knapsack table
		int[][] kTable = new int[items + 1][maxWeight + 1];
		for(int i = 0; i <= maxWeight; i++) {
			kTable[0][i] = 0;
		}
		
		//selecting the items
		for(int i = 1; i <= items; i++) {
			for (int j = 1; j <= maxWeight; j++) {
				//not chosen item: over the weight constraint
				if(weight[i-1] > j) {
					kTable[i][j] = kTable[i-1][j];
					
				} else {
					//chosen weight: in range of the weight constraint
					kTable[i][j] = Math.max(kTable[i-1][j], kTable[i-1][j - weight[i-1]] + values[i-1]);
					
				}
				
			}
			
			counter++;
		}
		//printing the number of iterations
		System.out.println("Number of iterations: " + counter);
		//returning the chosen values
		return kTable[items][maxWeight];
	}
	
}

