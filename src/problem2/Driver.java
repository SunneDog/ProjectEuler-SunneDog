package problem2;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1; int total = 0;
		int fibN = 0;
		System.out.println("Find the sum of all even-numbered values in a Fibonacci sequence that does not exceed four million.");
		fibN = fib(n);
		while(fibN < 4000000) {
			if(checkValid(fibN))
				total += fibN;
			n++;
			fibN = fib(n);
		}
		System.out.println(total);
	}
	/*
	 * Solution found at: http://www.geeksforgeeks.org/program-for-nth-fibonacci-number/
	 * Was on the wrong track with the solution for the method.
	 */
	private static int fib(int n) {
		int result = 0;
		if(n <= 1) 
			result = n;
		else
			result = fib(n - 1) + fib(n - 2);
		return result;
	}
	
	private static boolean checkValid(int n) {
		boolean result = false;
		if(n % 2 == 0) 
			result = true;
		return result;
	}

}
