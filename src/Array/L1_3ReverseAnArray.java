/**
 * 
 */
package Array;

/**
 * Given an array (or string), the task is to reverse the array/string.
 */
public class L1_3ReverseAnArray {

	public static void reverseArray(int[] arr) {
		int firstIndex = 0;
		int lastIndex = arr.length - 1;
		
		while(firstIndex < lastIndex) {
			int temp = arr[firstIndex];
			arr[firstIndex] = arr[lastIndex];
			arr[lastIndex] = temp;
			firstIndex++;
			lastIndex--;
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {7, 2, 3, 4, 5};
		reverseArray(arr);
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
	}

}
