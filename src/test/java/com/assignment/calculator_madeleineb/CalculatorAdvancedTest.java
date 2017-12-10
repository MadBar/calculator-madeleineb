package com.assignment.calculator_madeleineb;

import static org.junit.Assert.assertEquals;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.logging.Logger;

import org.junit.Test;

public class CalculatorAdvancedTest {
	CalculatorAdvanced ca = new CalculatorAdvanced();
	Random r = new Random();
	static final Logger LOG = Logger
			.getLogger(CalculatorAdvanced.class.getName());
	DecimalFormat df = new DecimalFormat("0.00");

	@Test
	public void testPow2Positive() {

		double nr = 0.0;
		double result = 0.0;
		double resultFromMethod = 0.0;

		for (int i = 0; i < 50; i++) {
			nr = Double.valueOf(
					df.format(r.nextDouble() * 10));
			result = nr * nr;
			resultFromMethod = ca.pow2(nr);

			LOG.info(
					"Testing the method pow2 positive with: "
							+ nr + ". Result from test: "
							+ result
							+ ", result from method: "
							+ resultFromMethod);
			assertEquals(resultFromMethod, result, 1);

		}
	}

	@Test
	public void testPow2Negative() {

		double nr = 0.0;
		double result = 0.0;
		double resultFromMethod = 0.0;

		for (int i = 0; i < 50; i++) {
			nr = Double.valueOf(
					df.format(r.nextDouble() * -10));
			result = nr * nr;
			resultFromMethod = ca.pow2(nr);

			LOG.info(
					"Testing the method pow2 negative with: "
							+ nr + ". Result from test: "
							+ result
							+ ", result from method: "
							+ resultFromMethod);
			assertEquals(resultFromMethod, result, 1);

		}
	}

	@Test
	public void testPow2Zero() {

		double nr = 0.0;
		double result = 0.0;
		double resultFromMethod = 0.0;

		result = nr * nr;
		resultFromMethod = ca.pow2(nr);

		LOG.info("Testing the method pow2 zero with: " + nr
				+ ". Result from test: " + result
				+ ", result from method: "
				+ resultFromMethod);
		assertEquals(resultFromMethod, result, 0);

	}
	
	@Test
	public void testPow3Positive() {

		double nr = 0.0;
		double result = 0.0;
		double resultFromMethod = 0.0;

		for (int i = 0; i < 50; i++) {
			nr = Double.valueOf(
					df.format(r.nextDouble() * 10));
			result = nr * nr * nr;
			resultFromMethod = ca.pow3(nr);

			LOG.info(
					"Testing the method pow3 positive with: "
							+ nr + ". Result from test: "
							+ result
							+ ", result from method: "
							+ resultFromMethod);
			assertEquals(resultFromMethod, result, 1);

		}
	}

	@Test
	public void testPow3Negative() {

		double nr = 0.0;
		double result = 0.0;
		double resultFromMethod = 0.0;

		for (int i = 0; i < 50; i++) {
			nr = Double.valueOf(
					df.format(r.nextDouble() * -10));
			result = nr * nr * nr;
			resultFromMethod = ca.pow3(nr);

			LOG.info(
					"Testing the method pow3 negative with: "
							+ nr + ". Result from test: "
							+ result
							+ ", result from method: "
							+ resultFromMethod);
			assertEquals(resultFromMethod, result, 1);

		}
	}

	@Test
	public void testPow3Zero() {

		double nr = 0.0;
		double result = 0.0;
		double resultFromMethod = 0.0;

		result = nr * nr * nr;
		resultFromMethod = ca.pow3(nr);

		LOG.info("Testing the method pow3 zero with: " + nr
				+ ". Result from test: " + result
				+ ", result from method: "
				+ resultFromMethod);
		assertEquals(resultFromMethod, result, 0);

	}

}
