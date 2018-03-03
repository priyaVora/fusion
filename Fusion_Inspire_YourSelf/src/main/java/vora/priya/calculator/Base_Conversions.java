package vora.priya.calculator;

import vora.priya.enums.Programming_Conversions;

public class Base_Conversions {
	Programming_Conversions conversionType;

	public static void main(String[] args) {
		Base_Conversions conversion = new Base_Conversions();
		System.out.println(conversion.Decimal_To_Binary(78.0));
	}

	public String Decimal_To_Binary(Double value) {
		conversionType = Programming_Conversions.BINARY;
		int leftOver = Integer.MAX_VALUE;
		Integer remainder;
		Integer newValue = (int) Math.floor(value);
		String binarySequence = "";
		String[] sequence = { "0", "0", "0", "0", "0", "0", "0", "0" };
		int val = newValue;
		int count = 7;
		while (leftOver != 0) {
			leftOver = (int) Math.floor(newValue);
			remainder = getRemainderBinary(leftOver);
			if (leftOver == 0) {
				break;
			}
			sequence[count] = "" + remainder;
			count--;
			newValue = (int) (val / conversionType.getBaseNumber());
			val = newValue;
		}
		for (String octet : sequence) {
			binarySequence += octet;
		}
		return binarySequence;
	}

	public Integer getRemainderBinary(int value) {
		Integer answer = (value % 2);
		return answer;
	}

	public void Decimal_To_Hexdecimal() {

	}

	public void Decimal_To_Octal() {

	}

	public void Binary_To_Decimal() {

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
