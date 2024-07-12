/**
 * 
 */
package MathAlgortihms;

/**
 * Time Complexity: O(n)
 * Auxiliary Space: O(1)
 */
public class FactorialOfANumber {
	
	static int factorialOfNumber(int n) {
		int result = 1;
		for(int i = 1; i <= n; i++) {
			result = result * i;
		}
		return result;
	}
	
	static int recursiveFactorial(int n) {
		
		return n== 0 ? 1 : n * recursiveFactorial(n - 1);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 5;
		System.out.println(factorialOfNumber(number));
		System.out.println(recursiveFactorial(number));

	}

}
