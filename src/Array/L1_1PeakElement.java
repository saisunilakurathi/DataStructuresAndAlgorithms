/**
 * 
 */
package Array;

/**
 * Find a peak element which is not smaller than its neighbours
 */
public class L1_1PeakElement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {10, 10, 20, 5};
		
		int peakElement = findPeakElement(arr);
		System.out.println(peakElement);

	}

	private static int findPeakElement(int[] arr) {
		
		if(arr.length == 1)
			return arr[0];
		if(arr.length < 1)
			return -1;
		
		for(int i = 1; i < arr.length; i++) {
			if(arr[i - 1] < arr[i] && arr[i] > arr[i+1]) {
				return arr[i];
			}
		}

		return 0;
	}

}
