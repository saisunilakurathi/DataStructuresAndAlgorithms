/**
 * 
 */
package MathAlgortihms;

/**
 * 
 */
public class TrailingZerosInFactorial {

	// Time Complexity: O(n) + O(log(n)) = O(n)
	static int getTrailingZerosInFactorial(int n) {
		int result = 0;
		int factorial = 1;
		for(int i = 2; i <=n; i++) {
			factorial = factorial * i;
		}
		while(factorial % 10 == 0) {
			result++;
			factorial = factorial / 10;
		}
		return result;
	}
	
	// Time Complexity : O(log(n))
	// Auxiliary Space: O(1)
	static int getTrailingZerosEffeciently(int n) {
		int result = 0;
		for(int i = 5; i <= n; i = i * 5) {
			result = result + n / i;
		}
		return result;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 10;
		System.out.println(getTrailingZerosInFactorial(n));
		System.out.println(getTrailingZerosEffeciently(n));

	}

}
