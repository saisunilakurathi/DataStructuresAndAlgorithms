/**
 * 
 */
package Array;

import java.util.Arrays;

/**
 * Program to find the minimum (or maximum) element of an array
 */
public class L1_2ArrayMinMaxElement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, -1, 0, 3, 1};
		Arrays.sort(arr);
		System.out.println("Min element is: " + arr[0] + " Max Element is: " + arr[arr.length - 1]);

	}

}
