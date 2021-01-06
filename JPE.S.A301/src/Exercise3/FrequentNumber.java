/*
 * @author LuongBang16
 * @date Jan 6, 2021
 * @version 1.0
 */
package Exercise3;

import java.util.Scanner;

public class FrequentNumber {

	public static void main(String[] args) {
		int [] array;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length: ");
		int len = Integer.parseInt(sc.nextLine());
		
		array = new int[len];
		System.out.println("Enter values: ");
		int i = 0;
		char c = 'n';
		do {
			System.out.print("array[" + (i+1) + "] = ");
			array[i] = Integer.parseInt(sc.nextLine());
			i++;
			if (i < len) {
				System.out.println("Do you want to continue? Y/N");
				c = sc.next().charAt(0);
				sc.nextLine();
			}
		} while (i < len && (c == 'Y' || c == 'y'));
		
		System.out.print("Enter a value: ");
		int value = Integer.parseInt(sc.nextLine());
		
		int sum = 0;
		System.out.print("Indexs: ");
		for (int j = 0; j < array.length; j++) {
			if (array[j] == value) {
				sum++;
				System.out.print(j + " ");
			}
		}
		System.out.println();
		System.out.println("Amount of frequence: " + sum);
		sc.close();
	}

}
