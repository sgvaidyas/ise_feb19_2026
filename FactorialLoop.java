package com.ds;

public class FactorialLoop {
	static int fact(int n)
	{
		if(n==1)
			return 1;
		return n*fact(n-1);
	}
	public static void main(String[] args) {
		int n=3,f=1;
//		for(int i=1;i<=n;i++)
//			f=f*i;
		System.out.println("Factorial = "+fact(n));
	}
}
