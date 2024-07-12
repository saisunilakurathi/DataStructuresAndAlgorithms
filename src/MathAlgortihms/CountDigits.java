/**
 * 
 */
package MathAlgortihms;

/**
 * Time Complexity : O(d) or O(log(n))
 * d : number of digits in the input
 * Auxiliary space: O(1) or constant
 */
public class CountDigits {
	
	static int countDigits(int input) {
		
		int result = 0;
		while(input > 0) {
			input = input/10;
			result++;
		}
		return result;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int input = 456;
		System.out.println(countDigits(input));
	}

}
