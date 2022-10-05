
public class Fibonacci_Dyn {
	
	public static int classicFib(int n) {
		if( n == 1 || n == 2) {
			return 1;
		} else {
			return classicFib(n-1) + classicFib(n-2);
		}
	}
	
	public static int fib(int n) {
	
		if(n == 1 || n == 2) {
			return 1;
		} 
		int[] fibArray = new int[n+1];
		fibArray[1] = 1;
		fibArray[2] = 1;
		for(int i = 3; i < fibArray.length; i++) {
			fibArray[i] = fibArray[i-1] + fibArray[i-2];
		}
		return fibArray[n];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//time 
		double startTime = System.currentTimeMillis()/1000;
		System.out.println("Dynamic programming solution of fibonacci: ");
		System.out.println(fib(10000));
		double endTime = System.currentTimeMillis()/1000;
		System.out.println("Time elapsed: " + (endTime - startTime));
		System.out.println(" ");
		double startTime2 = System.currentTimeMillis()/1000;
		System.out.println("Classic recursive solution of fibonacci: ");
		System.out.println(classicFib(45));
		double endTime2 = System.currentTimeMillis()/1000;
		System.out.println("Time elapsed: " + (endTime2 - startTime2));

	}

}
