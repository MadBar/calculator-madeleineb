package com.assignment.calculator_madeleineb;

public class CalculatorAdvanced
		implements CalculatorAdvancedOperationsInterface {

	public double pow2(double number) {
		
		return number*number;
	}

	public double pow3(double number) {
		
		return Math.pow(number, 3);
	}

	public double pow4(double number) {
		return Math.pow(number, 4);
	}

	public double pow5(double number) {
		return Math.pow(number, 5);
	}

	public double pow6(double number) {
		return Math.pow(number, 6);
	}

	public double powY(double numberToRaise,
			double powNumber) {
		return Math.pow(numberToRaise, powNumber);
	}

}
