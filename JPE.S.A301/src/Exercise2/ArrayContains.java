/*
 * @author LuongBang16
 * @date Jan 6, 2021
 * @version 1.0
 */
package Exercise2;

import java.util.Scanner;

public class ArrayContains {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length: ");
		int n = Integer.parseInt(sc.nextLine());
		String[] stringArray = new String[n];
		System.out.println("Enter elements of string array: ");
		for (int i = 0; i < stringArray.length; i++) {
			System.out.print("element [" + i + "]: ");
			stringArray[i] = sc.nextLine();
		}
		
		System.out.print("Enter value: ");
		String sValue = sc.nextLine();
		sc.close();
		
		System.out.print("Check '" + sValue + "' in array: ");
		int i;
		for (i = 0; i < stringArray.length; i++) {
			if (stringArray[i].equals(sValue)) {
				System.out.println("Contained");
				break;
			}
		}
		if (i == stringArray.length) {
			System.out.println("No contain");
		}
		
	}

}
