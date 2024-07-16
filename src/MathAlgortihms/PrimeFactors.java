/**
 * 
 */
package MathAlgortihms;

/**
 * 
 */
public class PrimeFactors {
	
	
	
	static boolean isPrime(int n) {
		if(n == 2 || n == 3) return true;
		if(n == 1 || n % 2 == 0 || n % 3 == 0) return false;
		for(int i = 5; i * i <= n; i+=6) {
			if(n % i == 0 || n % (i + 2) == 0) {
				return false;
			}
		}
		return true;
	}
	
	// Time Complexity: O(sqrt(n))
	static void printPrimeFactorsIdeal(int n) {
		if(n <= 1) return;
		while(n % 2 == 0) {
			System.out.println(2);
			n/=2;
		}
		while(n % 3 == 0) {
			System.out.println(3);
			n/=3;
		}
		
		for(int i = 5; i * i <= n; i+=6) {
			while(n % i  == 0) {
				System.out.println(i);
				n/=i;
			}
			while(n % (i + 2) == 0) {
				System.out.println(i);
				n/=(i+2);
			}
		}
		
		if(n > 3) {
			System.out.println(n);
		}
	}
	
	static void printPrimeFactorsOptimised(int n) {
		if(n <= 1) return;
		for(int i = 2; i * i <= n; i++) {
			while(n % i == 0) {
				System.out.println(i);
				n/=i;
			}
		}
		if(n > 1) 
			System.out.println(n);
	}

	//Time Complexity: O(n log(n))
	static void printPrimeFactors(int n) {
		for(int i = 2; i < n; i++) {
			if(isPrime(i)) {
				int x = i;
				while( n % x == 0) {
					System.out.println(i);
					x = x * i;
				}
			}
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 450;
		printPrimeFactors(n);
		System.out.println();
		printPrimeFactorsOptimised(n);
		System.out.println();
		printPrimeFactorsIdeal(n);

	}

}
