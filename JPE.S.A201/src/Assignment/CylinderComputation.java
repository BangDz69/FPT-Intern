/*
 * @author LuongBang16
 * @date Jan 6, 2021
 * @version 1.0
 */
package Assignment;

import java.util.Scanner;

public class CylinderComputation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input radius: ");
		double r = sc.nextInt();
		System.out.print("Input height: ");
		double h = sc.nextInt();
		double surfaceArea = 2*Math.PI*r*h;
		double baseArea = surfaceArea + 2*Math.PI*r*r;
		double volume = Math.PI*r*r*h;
		System.out.println("Surface area = " + surfaceArea);
		System.out.println("Base area = " + baseArea);
		System.out.println("Volume = " + volume);
		sc.close();
	}

}
