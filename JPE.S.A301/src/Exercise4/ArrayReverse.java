/*
 * @author LuongBang16
 * @date Jan 6, 2021
 * @version 1.0
 */
package Exercise4;

public class ArrayReverse {

	public static void main(String[] args) {
		int[] myIntArray = { 43, 32, 53, 23, 12, 34, 3, 12, 43, 32 };
		
		System.out.print("Before reverse: ");
		for (int i = 0; i < myIntArray.length; i++) {
			System.out.print(myIntArray[i] + " ");
		}
		System.out.println();
		
		int i = 0;
		int j = myIntArray.length - 1;
		while(i < j) {
			int temp = myIntArray[i];
			myIntArray[i] = myIntArray[j];
			myIntArray[j] = temp;
			i++;
			j--;
		}
		
		System.out.print("After reverse: ");
		
		for (int j2 = 0; j2 < myIntArray.length; j2++) {
			System.out.print(myIntArray[j2] + " ");
		}
	}

}
