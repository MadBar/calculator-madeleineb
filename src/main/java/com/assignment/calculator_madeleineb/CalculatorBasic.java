package com.assignment.calculator_madeleineb;

public class CalculatorBasic
		implements CalculatorBasicOperationsInterface {

	public double add(double firstNr, double secondNr) {

		// double result = firstNr + secondNr;
		// return result;

		return firstNr + secondNr;

	}

	public double subtract(double firstNr,
			double secondNr) {
		return firstNr - secondNr;
	}

	public double multiply(double firstNr,
			double secondNr) {
		return firstNr * secondNr;
	}

	public double divide(double firstNr, double secondNr) {
		double roundMethodRes = 0;
		double result = firstNr / secondNr;
		if (Double.isInfinite(result)) {
			System.out.println("Can't devide by 0");
			// result = -100;
			return -0.123456789;
		}

		roundMethodRes = Math.round(result*100.00)/100.00;
		return roundMethodRes;

	}

}
