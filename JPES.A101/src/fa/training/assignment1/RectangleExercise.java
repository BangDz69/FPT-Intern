/*
 * @author LuongBang16
 * @date Jan 6, 2021
 * @version 1.0
 */
package fa.training.assignment1;

import java.util.Scanner;

public class RectangleExercise {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Width: ");
		float w = sc.nextFloat();
		System.out.print("Height: ");
		float h = sc.nextFloat();
		System.out.println("Area is " + w + " * " + h + " = " + w*h);
		System.out.println("Perimeter is 2 * (" + w + " + " + h + ") = " + 2*(w+h));
		sc.close();
	}

}
