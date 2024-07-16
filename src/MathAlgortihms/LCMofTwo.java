/**
 * 
 */
package MathAlgortihms;

/**
 * 
 */
public class LCMofTwo {
	
	static int gcd(int num1, int num2) {
		if(num2 == 0)
			return num1;
		else 
			return gcd(num2, num1 % num2);
	}
	
	static int getLCMofTwoOptimised(int num1, int num2) {
		return (num1 * num2) / gcd(num1, num2);
	}
	
	static int getLCMofTwo(int num1, int num2) {
		int result = Math.max(num1, num2);
		while(true) {
			if(result % num1 == 0 && result % num2 == 0) {
				break;
			}
			result++;
		}
		return result;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 4, num2 = 6;
		System.out.println("getLCMofTwo: " + getLCMofTwo(num1, num2));
		System.out.println("getLCMofTwoOptimised: " + getLCMofTwoOptimised(num1, num2));
	}

}
