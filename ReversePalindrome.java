package com.ds;

public class ReversePalindrome {

	public static void main(String[] args) {
		int n=1234;
		int rev=0,rem,original;
		original=n;
		while(n>0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		System.out.println("Reverse = "+rev);
		if(original==rev)
			System.out.println("Palindrome");
		else
			System.out.println("Not palindrome");
	}
}
