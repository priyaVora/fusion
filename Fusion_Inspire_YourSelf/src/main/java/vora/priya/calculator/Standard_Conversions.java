package vora.priya.calculator;

import vora.priya.enums.CalculatorType;

public class Standard_Conversions {
	CalculatorType type;

	public static void main(String[] args) {
		Standard_Conversions c = new Standard_Conversions();
		System.out.println(c.squareRoot(25.0));
	}

	public Double add(Double input1, Double input2) {
		Double value = input1 + input2;
		return value;
	}

	public Double subtract(Double input1, Double input2) {
		Double value = input1 - input2;
		return value;
	}

	public Double multiple(Double input1, Double input2) {
		Double value = input1 * input2;
		return value;
	}

	public Double divide(Double input1, Double input2) {
		Double value = (input1 / input2);
		return value;
	}

	public Double squareRoot(Double input) {
		Double t;
		Double squareRoot = input / 2;

		do {
			t = squareRoot;
			int divideInput = (int) (input / t);
			double value = t + divideInput;
			squareRoot = (value / 2);
		} while ((t - squareRoot) != 0);

		return squareRoot;
	}

	public Double square(Double input) {
		Double value = multiple(input, input);
		return value;
	}

	public void rationFunction() {

	}
}
