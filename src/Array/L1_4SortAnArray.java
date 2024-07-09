/**
 * 
 */
package Array;

/**
 * 
 */
public class L1_4SortAnArray {
	
	public static void sortAnArray(int[] arr) {
		
		int minIndex = 0;
		for(int i = 0; i < arr.length - 1; i++) {
			minIndex = i;
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[j] < arr[minIndex]) {
					minIndex = j;
				}
				
			}
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {-2, 0, -1, 5, 1, 2};
		sortAnArray(arr);
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + ", ");
		}

	}

}
