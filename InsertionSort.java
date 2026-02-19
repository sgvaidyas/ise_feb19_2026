package com.ds;

import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		int n=5,key,i,j;
		int[] a = new int[n];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array elements");
		for(i=0;i<n;i++)
			a[i]=sc.nextInt();
		
		//insertion sort
		for(i=1;i<n;i++)
		{
			key = a[i];
			j = i-1;
			while(j>=0 && a[j]>key)
			{
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=key;
		}

		System.out.println("Sorted array elements");
		for(i=0;i<n;i++)
			System.out.print(a[i]+"\t");
	}
}
