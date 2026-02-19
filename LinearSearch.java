package com.ds;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		int n=5;
		int[] a = new int[n];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array elements");
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		
		int key;
		System.out.println("Enter the key ele = ");
		key = sc.nextInt();
		
		boolean isFound=false;
		
		for(int i=0;i<n;i++)
		{
			if(a[i]==key)
			{
				isFound=true;
				System.out.println("KEY found at ind = "+i);
			}
		}
		if(isFound==false)
			System.out.println("Key not found");
	}

}
