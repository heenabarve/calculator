package com.calculator.my.calculator;

public class MyCalculator {

	
	int firstValue,secondValue;
	
	public MyCalculator(int a,int b) {
		// TODO Auto-generated constructor stub
		firstValue = a;
		secondValue = b;
	}
	

	public MyCalculator()
	{
		
	}
	
	
	int addition()
	{
		int ans;
		ans=firstValue+secondValue;
		return ans;

	}

	private int subtraction()
	{
		int ans;
		ans=firstValue-secondValue;
		return ans;

	}

	int subtraction2()
	{
		int ans;
		ans=subtraction();
		return ans;

	}
	
	int multiplication()
	{
		int ans;
		ans=firstValue*secondValue;
		return ans;

	}

	int division()
	{
		int ans;
		ans=firstValue/secondValue;
		return ans;

	}

}


