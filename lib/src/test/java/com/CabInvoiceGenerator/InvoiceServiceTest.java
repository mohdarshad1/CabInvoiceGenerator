package com.CabInvoiceGenerator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class InvoiceServiceTest {
	InvoiceGenerator invoiceGenerator = null;

	@Before
	public void setUp() throws Exception {
		invoiceGenerator = new InvoiceGenerator();
	}

	@Test
	public void givenDistanceAndTime_ShouldCalculate_ReturnTotalFare() {
		double distance = 5;
		int time = 3;
		double fare = invoiceGenerator.calculateFare(distance, time);
		Assert.assertEquals(53, fare, 0.0);
	}

	@Test
	public void givenLessDistanceAndTimeShouldCalculate_ReturnMinimumFare() {
		double distance = 0.1;
		int time = 1;
		double fare = invoiceGenerator.calculateFare(distance, time);
		Assert.assertEquals(5, fare, 0.0);
	}
}