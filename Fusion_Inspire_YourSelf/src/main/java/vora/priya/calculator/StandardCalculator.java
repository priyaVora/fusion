package vora.priya.calculator;

import java.util.HashMap;
import java.util.Map;

import vora.priya.enums.CalculatorType;

public class StandardCalculator {
	CalculatorType type;

	public static void main(String[] args) {
		StandardCalculator c = new StandardCalculator();
		Map<Integer, String> hasMap = new HashMap<Integer, String>();
		
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
