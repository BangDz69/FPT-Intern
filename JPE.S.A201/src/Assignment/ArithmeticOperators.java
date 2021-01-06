/*
 * @author LuongBang16
 * @date Jan 6, 2021
 * @version 1.0
 */
package Assignment;

import java.util.Scanner;

public class ArithmeticOperators {

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
		System.out.print("Input the fifth number: ");
		int e = sc.nextInt();
		int sum = a + b + c + d + e;
		System.out.println("The sum is " + sum);
		sc.close();
	}

}
