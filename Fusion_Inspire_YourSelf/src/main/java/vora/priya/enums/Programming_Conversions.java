package vora.priya.enums;

public enum Programming_Conversions {
	BINARY(2.0), DECIMAL(10.0), HEXADECIMAL(16.0), OCTAL(8.0);

	private Double baseNumber;

	private Programming_Conversions(Double baseNumber) {
		this.baseNumber = baseNumber;
	}

	public Double getBaseNumber() {
		return baseNumber;
	}

	public void setBaseNumber(Double baseNumber) {
		this.baseNumber = baseNumber;
	}
}
