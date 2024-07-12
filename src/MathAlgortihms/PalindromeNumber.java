/**
 * 
 */
package MathAlgortihms;

/**
 * Time Complexity : O(d) or O(log(n))
 * d : number of digits in the input
 * Auxiliary space: O(1) or constant
 */
public class PalindromeNumber {

	static boolean isPalindrome(int number) {
		int tempNumber = number;
		int reverseNum = 0;
		while(tempNumber != 0) {
			reverseNum = (reverseNum * 10) + (tempNumber % 10);	
			tempNumber = tempNumber / 10;
		}
		
		return (reverseNum == number);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number = 108;
		System.out.println(isPalindrome(number));

	}

}
