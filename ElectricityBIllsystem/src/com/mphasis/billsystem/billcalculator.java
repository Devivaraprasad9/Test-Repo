package com.mphasis.billsystem;

public class billcalculator {

	public static void main(String[] args) {
		
		int units = 280;
		double billtopay = 0;
		if(units < 100)
		{
			billtopay = units*1.20;
		}
		else if(units < 300)
		{
			billtopay = 100*1.20 + (units - 100)*2;
		}
		System.out.println("the electricity bill for" +units+ "is :" + billtopay);

	}

}
