package com.ds;

public class SumofDigits {
	public static void main(String[] args) {
		int n=123456;
		int sum=0,rem;
		
		while(n>0)
		{
			rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		System.out.println("Sum of dig = "+sum);
	}
}
