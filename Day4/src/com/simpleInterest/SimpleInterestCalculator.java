package com.simpleInterest;

import java.math.BigDecimal;

public class SimpleInterestCalculator {

	BigDecimal principal;
	BigDecimal interest;

	public SimpleInterestCalculator(int principal, int interest) {
		this.principal = new BigDecimal(principal);
		this.interest = new BigDecimal(interest).divide(new BigDecimal(100));
	}

	public BigDecimal calculateTotalValue(int noOfYears) {

		BigDecimal add = principal
				.add(principal.multiply(interest).multiply(new BigDecimal(noOfYears)));
		return add;
	}

}
