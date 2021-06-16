package com.calculator.my.calculator;

import org.junit.Assert;
import org.junit.Test;

public class MyCalculatorTest {
	
	
	@Test
	public void addtionTest()
	{
		int expectedValue = 17;
		int firstVal = 5;
		int abhi = 12;

		System.out.println( "Hello World!" );
		MyCalculator mycal = new MyCalculator(abhi, firstVal);

		int actualValue = mycal.addition();
		
		
		Assert.assertEquals(expectedValue, actualValue);
	}

	
	@Test
	public void subtractTest()
	{
		int expectedValue = 7;
		int firstVal = 5;
		int abhi = 12;

		System.out.println( "Hello World!" );
		MyCalculator mycal = new MyCalculator(abhi, firstVal);

		int actualValue = mycal.subtraction2();
		
		Assert.assertEquals(expectedValue, actualValue);
	}

	
	@Test
	public void multiplicationTest()
	{
		int expectedValue = 62;
		int firstVal = 5;
		int abhi = 12;

		System.out.println( "Hello World!" );
		MyCalculator mycal = new MyCalculator(abhi, firstVal);

		int actualValue = mycal.multiplication();
		
		Assert.assertEquals("This test case failed due to mismatch",expectedValue, actualValue);
	}
	
	@Test
	public void divisionTest()
	{
		int expectedValue = 4;
		int firstVal = 3;
		int abhi = 12;

		System.out.println( "Hello World!" );
		MyCalculator mycal = new MyCalculator(abhi, firstVal);

		int actualValue = mycal.division();
		
		Assert.assertEquals(expectedValue, actualValue);
	}

}
