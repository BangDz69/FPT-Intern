/*
 * @author LuongBang16
 * @date Jan 6, 2021
 * @version 1.0
 */
package Exercise1;

public class SumAverageRunningInt {

	public static void main(String[] args) {
		int[] arr = new int[100];
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			sum += arr[i];
		}
		
		double average = sum/arr.length;
		
		System.out.println("Average of all 100 first number is: " + average);
	}

}
