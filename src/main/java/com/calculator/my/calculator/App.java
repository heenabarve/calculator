package com.calculator.my.calculator;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
	{
		int firstVal = 2;
		int abhi = 12;

		System.out.println( "Hello World!" );
		MyCalculator mycal = new MyCalculator(abhi, firstVal);

		int addition = mycal.addition();
		System.out.println("Addition ::" + addition);

		int subtraction2 = mycal.subtraction2();
		System.out.println("subtraction2::" + subtraction2);

		int division = mycal.division();
		System.out.println("division::" + division);

		int multiplication = mycal.multiplication();
		System.out.println("multiplication::" + multiplication);
	}
}
