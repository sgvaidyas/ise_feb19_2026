package com.ds;

public class SumEvenOdd {
	public static void main(String[] args) {
		int n=123456;
		int sumEven=0,sumOdd=0,rem;
		
		while(n>0)
		{
			rem=n%10;
			if(rem%2==0)
				sumEven =sumEven+rem;
			else
				sumOdd = sumOdd+rem;
			n=n/10;
		}
		System.out.println("Sum of even digs = "+sumEven);
		System.out.println("Sum of odd digs = "+sumOdd);
		
	}
}
