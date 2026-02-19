package com.ds;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		int n=5;
		int[] a = new int[n];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array elements");
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		
		
		//sorting it 
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
		
		int key;
		System.out.println("\nEnter the key ele = ");
		key = sc.nextInt();
		
		int l=0,h=n-1,mid;
		while(l<=h)
		{
			mid=(l+h)/2;
			if(a[mid]==key)
			{
				System.out.println("Found at pos = "+ mid);
				break;
			}
			else if(a[mid]< key)
				l=mid+1;
			else
				h=mid-1;
		}
		if(l>h)
			System.out.println("Search key not found");
	}

}
