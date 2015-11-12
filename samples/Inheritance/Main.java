package Inheritance;

public class Main {

	public static void main(String args[]) {

		int a = 20;
		int b = 10;

		AdvancedCalculation calculation = new AdvancedCalculation();
		calculation.add(a, b);
		calculation.substract(a, b);
		calculation.multiply(a, b);
		calculation.divide(a, b);

	}

}
