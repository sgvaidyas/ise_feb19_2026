package com.ds;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		int n=5;
		int[] a = new int[n];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array elements");
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
	
		int temp;
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-1-i;j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("Sorted array elements");
		for(int i=0;i<n;i++)
			System.out.print(a[i]+"\t");
	}

}
