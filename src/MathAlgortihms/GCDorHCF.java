/**
 * 
 */
package MathAlgortihms;

/**
 * 
 */
public class GCDorHCF {
	
	static int getGCDorHCFEucldian(int num1, int num2) {
		
		while(num1 != num2) {
			if(num1 > num2) {
				num1 = num1 - num2;
			} else {
				num2 = num2 - num1;
			}
		}
		return num1;
	}
	
	static int getGCDorHCFOptimised(int num1, int num2) {
		if(num2 == 0)
			return num1;
		else
			return getGCDorHCFOptimised(num2, num1 % num2);
	}
	
	//Time Complexity : O(min(num1, num2))
	static int getGCDorHCF(int num1, int num2) {
		int result = Math.min(num1, num2);
		while(result > 0) {
			if(num1 % result == 0 && num2 % result == 0) {
				break;
			}
			result--;
		}
		return result;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 12, num2 = 15;
		System.out.println("getGCDorHCF: " + getGCDorHCF(num1, num2));
		System.out.println("getGCDorHCFEucldian: " + getGCDorHCFEucldian(num1, num2));
		System.out.println("getGCDorHCFOptimised: " + getGCDorHCFOptimised(num1, num2));
	}

}
