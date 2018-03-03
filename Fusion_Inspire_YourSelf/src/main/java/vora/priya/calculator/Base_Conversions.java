package vora.priya.calculator;

import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.Stack;

import vora.priya.enums.Programming_Conversions;

public class Base_Conversions {
	Programming_Conversions conversionType;

	public static void main(String[] args) {
		Base_Conversions conversion = new Base_Conversions();
		System.out.println(conversion.Decimal_To_Binary(7.0));
		System.out.println(conversion.Decimal_To_Hexdecimal(225));
		System.out.println(conversion.Decimal_To_Octal(33.0));
		System.out.println(conversion.Binary_To_Decimal("10000"));
		// System.out.println(conversion.Binary_To_Octal("10000"));
		// conversion.Binary_To_Decimal("7");
		// System.out.println(conversion.separateOctects("011111000000"));
		System.out.println(conversion.Binary_To_Hexadecimal("011001001110"));
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
			sequence = validBinaryFormat(count, sequence);
		}
		return sequence;
	}

	public String Decimal_To_Hexdecimal(int value) {
		conversionType = Programming_Conversions.HEXADECIMAL;
		String answerString = Integer.toHexString(value);
		char[] list = answerString.toCharArray();
		answerString = "";
		for (char c : list) {
			c = Character.toUpperCase(c);
			answerString += c;
		}
		return answerString;
	}

	public String Decimal_To_Octal(Double value) {
		conversionType = Programming_Conversions.OCTAL;
		return Decimal_To_BaseHelper(value, conversionType);
	}

	public String validBinaryFormat(int count, String sequence) {
		if (count % 4 != 0) {
			while (count % 4 != 0) {
				String temp = sequence;
				sequence = "";
				sequence += "0";
				sequence += temp;
				count++;
			}
		}
		return sequence;
	}

	private String separateOctects(String sequence) {
		int count = sequence.length();
		sequence = validBinaryFormat(count, sequence);
		String updatedSeq = "";
		char[] list = sequence.toCharArray();
		for (int i = 0; i < list.length; i++) {
			if (i % 4 != 0) {
				updatedSeq += list[i];
			} else {
				if (i != 0) {
					updatedSeq += " ";
					updatedSeq += list[i];
				} else {
					updatedSeq += list[i];
				}
			}
		}
		return updatedSeq;
	}

	public Integer Binary_To_Decimal(String sequence) {
		int count = sequence.length();
		sequence = validBinaryFormat(count, sequence);
		char[] seqChar = sequence.toCharArray();
		Integer decimalValue = 0;
		int power = 0;
		for (int i = seqChar.length - 1; i >= 0; i--) {
			if (seqChar[i] == '1') {
				decimalValue += (int) Math.pow(2, power);
			}
			power++;
		}
		return decimalValue;
	}

	public String Binary_To_Hexadecimal(String sequence) {
		sequence = separateOctects(sequence);
		String[] octets = sequence.split(" ");
		String answer = "";
		for (String octet : octets) {
			int decimalValue = Binary_To_Decimal(octet);
			answer += Decimal_To_Hexdecimal(decimalValue);
		}
		return answer;
	}

	public String convertDigitTo_HexDigit() {
		return null;
	}

	public String Binary_To_Octal(String sequence) {
		int count = sequence.length();
		sequence = validBinaryFormat(count, sequence);
		System.out.println("Sequence : " + sequence);
		int countOfNumbers = 0;
		while (countOfNumbers != sequence.length()) {
			if (true) {

			}
			countOfNumbers++;
		}
		return null;
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
