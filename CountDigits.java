package com.ds;

public class CountDigits {
	public static void main(String[] args) {
		int n=798798779;
		int c=0;
		
		while(n>0)
		{
			c++;
			n=n/10;
		}
		System.out.println("Count of dig = "+c);
	}
}
