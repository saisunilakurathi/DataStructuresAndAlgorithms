/**
 * 
 */
package MathAlgortihms;

/**
 * 
 */
public class CheckForPrime {
	
	static boolean checkIsPrimeIdeal(int num) {
		if(num == 2 || num == 3) return true;
		if(num == 1 || num % 2 == 0 || num % 3 == 0) {
			return false;
		}
		for(int i = 5; i * i <= num; i = i + 6) {
			if(num % i == 0 || num % (i + 2) == 0) {
				return false;
			}
		}
		return true;
	}
	
	//Time Complexity: O(sqrt(n))
	static boolean checkIsPrimeOptimised(int num) {
		if(num == 1) return false;
		for(int i = 2; i * i <= num; i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}

	//Time Complexity: O(n)
	static boolean checkIsPrime(int num) {
		if(num == 1)
			return false;
		for(int i = 2; i < num; i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 5; // 121, 1031
		System.out.println("checkIsPrime: " + checkIsPrime(num));
		System.out.println("checkIsPrimeOptimised: " + checkIsPrimeOptimised(num));
		System.out.println("checkIsPrimeIdeal: " + checkIsPrimeIdeal(num));

	}

}
