package com.assignment.calculator_madeleineb;

import static org.junit.Assert.*;
import java.text.DecimalFormat;
import java.util.Random;
import java.util.logging.Logger;
import org.junit.Test;

public class CalculatorBasicDivideTest {

	CalculatorBasic cb = new CalculatorBasic();
	Random r = new Random();
	static final Logger LOG = Logger.getLogger(CalculatorBasic.class.getName());
	DecimalFormat df = new DecimalFormat("0.00");

	@Test
	public void testDividePositive() {

		double firstRandomNr = 0;
		double secondRandomNr = 0;
		double result = 0;
		double resultFromMethod = 0;

		for (int i = 0; i < 50; i++) {
			firstRandomNr = Double.valueOf(df.format(r.nextDouble() * 10));
			secondRandomNr = Double.valueOf(df.format(r.nextDouble() * 10));

			try {
				result = firstRandomNr / secondRandomNr;

				resultFromMethod = cb.divide(firstRandomNr, secondRandomNr);

			} catch (ArithmeticException e) {
				e.getMessage();
			}

			if (resultFromMethod == -0.123456789) {
				result = -0.123456789;
			}

			LOG.info(i + " Testing the method Divide positive with: " + firstRandomNr
					+ " and " + secondRandomNr + ". Result from test: " + result
					+ ", result from method: " + resultFromMethod);
			assertEquals(resultFromMethod, result, 1);
		}

	}

	@Test
	public void testDivideNegative() {

		double firstRandomNr = 0;
		double secondRandomNr = 0;
		double result = 0;
		double resultFromMethod = 0;

		for (int i = 0; i < 50; i++) {
			firstRandomNr = Double.valueOf(df.format(r.nextDouble() * -10));
			secondRandomNr = Double.valueOf(df.format(r.nextDouble() * -10));

			try {
				result = firstRandomNr / secondRandomNr;

				resultFromMethod = cb.divide(firstRandomNr, secondRandomNr);
			} catch (ArithmeticException e) {
				e.getMessage();
			}

			if (resultFromMethod == -0.123456789) {
				result = -0.123456789;
			}

			LOG.info(i + " Testing the method Divide negative with: " + firstRandomNr
					+ " and " + secondRandomNr + ". Result from test: " + result
					+ ", result from method: " + resultFromMethod);
			assertEquals(resultFromMethod, result, 1);
		}

	}

	@Test
	public void testDivideFirstZero() {

		double firstRandomNr = 0;
		double secondRandomNr = 0;
		double result = 0;
		double resultFromMethod = 0;

		for (int i = 0; i < 50; i++) {
			secondRandomNr = Double.valueOf(df.format(r.nextDouble() * 10));

			try {
				result = firstRandomNr / secondRandomNr;

				resultFromMethod = cb.divide(firstRandomNr, secondRandomNr);
			} catch (ArithmeticException e) {
				e.getMessage();
			}

			if (resultFromMethod == -0.123456789) {
				result = -0.123456789;
			}

			LOG.info(i + " Testing the method Divide first zero with: " + firstRandomNr
					+ " and " + secondRandomNr + ". Result from test: " + result
					+ ", result from method: " + resultFromMethod);
			assertEquals(resultFromMethod, result, 0);
		}

	}

	@Test
	public void testDivideSecondZero() {

		double firstRandomNr = 0;
		double secondRandomNr = 0;
		double result = 0;
		double resultFromMethod = 0;

		for (int i = 0; i < 50; i++) {
			firstRandomNr = Double.valueOf(df.format(r.nextDouble() * 10));

			result = firstRandomNr / secondRandomNr;
			resultFromMethod = cb.divide(firstRandomNr, secondRandomNr);

			if (resultFromMethod == -0.123456789) {
				result = -0.123456789;
			}

			LOG.info(i + " Testing the method Divide second zero with: " + firstRandomNr
					+ " and " + secondRandomNr + ". Result from test: " + result
					+ ", result from method: " + resultFromMethod);
			assertEquals(resultFromMethod, result, 0);
		}

	}

	@Test
	public void testDivideBothZeros() {

		double firstRandomNr = 0;
		double secondRandomNr = 0;
		double result = firstRandomNr / secondRandomNr;
		double resultFromMethod = cb.divide(firstRandomNr, secondRandomNr);

		if (resultFromMethod == -0.123456789) {
			result = -0.123456789;
		}

		LOG.info("Testing the method Divide both zeros with: " + firstRandomNr + " and "
				+ secondRandomNr + ". Result from test: " + result
				+ ", result from method: " + resultFromMethod);
		assertEquals(resultFromMethod, result, 0);

	}

}
