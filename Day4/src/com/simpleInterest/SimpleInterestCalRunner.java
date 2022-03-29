package com.simpleInterest;

import java.math.BigDecimal;

public class SimpleInterestCalRunner {

	public static void main(String[] args) {

		// SimpleInterestFormula=principal+(principal*noOfYears*RateOfInterest)/100

		SimpleInterestCalculator calculate = new SimpleInterestCalculator(4500, 7);

		BigDecimal totalValue = calculate.calculateTotalValue(5);
		System.out.println(totalValue);

	}
}
