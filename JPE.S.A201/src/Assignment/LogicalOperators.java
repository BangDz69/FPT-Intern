/*
 * @author LuongBang16
 * @date Jan 6, 2021
 * @version 1.0
 */
package Assignment;

import java.util.Scanner;

public class LogicalOperators {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input the first number: ");
		int a = sc.nextInt();
		System.out.print("Input the second number: ");
		int b = sc.nextInt();
		System.out.print("Input the third number: ");
		int c = sc.nextInt();
		System.out.print("Input the forth number: ");
		int d = sc.nextInt();
		if (a == b && b == c && c ==d) {
			System.out.println("Numbers are equal");
		}
		else {
			System.out.println("Numbers are not equal");
		}
		sc.close();
	}
}
