package vora.priya.calculator;

import java.util.EmptyStackException;
import java.util.Stack;

import vora.priya.enums.Programming_Conversions;

public class Base_Conversions {
	Programming_Conversions conversionType;

	public static void main(String[] args) {
		Base_Conversions conversion = new Base_Conversions();
		System.out.println(conversion.Decimal_To_Binary(7.0));
		System.out.println(conversion.Decimal_To_Hexdecimal(7.0));
		System.out.println(conversion.Decimal_To_Octal(33.0));
	}

	public String Decimal_To_Binary(Double value) {
		conversionType = Programming_Conversions.BINARY;
		return Decimal_To_BaseHelper(value, conversionType);
	}

	private Integer getRemainderBinary(int value) {
		Integer answer = (int) (value % conversionType.getBaseNumber());
		return answer;
	}

	private String Decimal_To_BaseHelper(Double value, Programming_Conversions conversionType) {
		int leftOver = Integer.MAX_VALUE;
		Integer remainder;
		Integer newValue = (int) Math.floor(value);
		String sequence = "";
		int val = newValue;

		Stack<Integer> binaryStack = new Stack<Integer>();

		while (leftOver != 0) {
			leftOver = (int) Math.floor(newValue);
			remainder = getRemainderBinary(leftOver);
			if (leftOver == 0) {
				break;
			}
			binaryStack.push(remainder);
			newValue = (int) (val / conversionType.getBaseNumber());
			val = newValue;
		}
		int count = 0;
		try {
			while ((!binaryStack.isEmpty())) {
				sequence += binaryStack.peek();
				binaryStack.pop();
				count++;
			}
		} catch (EmptyStackException e) {
			System.out.println("empty stack");
		}
		if (conversionType == Programming_Conversions.BINARY) {
			if (count % 4 != 0) {
				while (count % 4 != 0) {
					String temp = sequence;
					sequence = "";
					sequence += "0";
					sequence += temp;
					count++;
				}
			}
		}
		return sequence;
	}

	public String Decimal_To_Hexdecimal(Double value) {
		conversionType = Programming_Conversions.HEXADECIMAL;
		return Decimal_To_BaseHelper(value, conversionType);
	}

	public String Decimal_To_Octal(Double value) {
		conversionType = Programming_Conversions.OCTAL;
		return Decimal_To_BaseHelper(value, conversionType);
	}

	
	public void Binary_To_Decimal(Double value) {

	}

	public void Binary_To_Hexadecimal() {
		
	}

	public void Binary_To_Octal() {

	}

	public void Hexadecimal_To_Decimal() {

	}

	public void Hexadecimal_To_Binary() {

	}

	public void Octal_To_Decimal() {

	}

	public void Octal_To_Binary() {

	}

	public void Octal_To_Hexadecimal() {

	}
}
