package problem2;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 0; int total = 0;
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
	 * Need to fix the fibonacci method
	 * maybe avoid recursion?
	 */
	private static int fib(int n) {
		int result = 0;
		if(n == 0) {
			result = 1;
		} else if(n == 1) {
			result = 2;
		} else if(n == 2) {
			result = 3;
		} else
			result = fib(n - 2) + fib(n - 1);
		System.out.println(result);
		return result;
	}
	
	private static boolean checkValid(int n) {
		boolean result = false;
		if(n % 2 == 0) 
			result = true;
		return result;
	}

}
