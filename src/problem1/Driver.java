package problem1;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n; int total = 0;
		System.out.println("What is the sum of all the multiples of 3 or 5 below 1000?");
		
		for(n = 0; n < 1000; n++) {
			if(checkValid(n))
				total += n;
		}
		System.out.println(total);
	}
	
	private static boolean checkValid(int n) {
		boolean result = false;
		if(n % 3 == 0 || n % 5 == 0) 
			result = true;
		return result;
	}

}
