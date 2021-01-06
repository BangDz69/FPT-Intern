/*
 * @author LuongBang16
 * @date Jan 6, 2021
 * @version 1.0
 */
package fa.training.assignment1;

public class ArithmeticExercise2 {
	
	public int sum(int a, int b) {
		return a + b;
	}
	
	public int subtract(int a, int b) {
		return a - b;
	}
	
	public int multiply(int a, int b) {
		return a * b;
	}
	
	public int divide(int a, int b) {
		return a/b;
	}

	public int remainder(int a, int b) {
		return a%b;
	}
	
	public static void main(String[] args) {
		int a = 125;
		int b = 24;
		ArithmeticExercise2 op = new ArithmeticExercise2();
		System.out.println(a + " + " + b + " = " + op.sum(a,b));
		System.out.println(a + " - " + b + " = " + op.subtract(a,b));
		System.out.println(a + " * " + b + " = " + op.multiply(a,b));
		System.out.println(a + " / " + b + " = " + op.divide(a,b));
		System.out.println(a + " % " + b + " = " + op.remainder(a,b));
	}
}
