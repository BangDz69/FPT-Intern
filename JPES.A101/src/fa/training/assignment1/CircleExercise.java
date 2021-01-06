/*
 * @author LuongBang16
 * @date Jan 6, 2021
 * @version 1.0
 */
package fa.training.assignment1;

import java.util.Scanner;

public class CircleExercise {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter radius: ");
		float r = sc.nextFloat();
		System.out.println("Perimeter is: " + 2*Math.PI*r);
		System.out.println("Area is: " + Math.PI*r*r);
		sc.close();
	}
}
