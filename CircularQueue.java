package com.ds;

import java.util.Scanner;

public class CircularQueue {

	public static void main(String[] args) {
		final int max=5;
		int f=0,r=-1;
		int[] q=new int[max];
		int ele,ch;
		boolean flag=true;
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("1 Enqueue 2 Dequeue 3 Display 4 Exit");
			System.out.print("Enter choice = ");
			ch = sc.nextInt();
			switch(ch)
			{
			case 1:
				if(r-f == max-1)
					System.out.println("Queue overflow");
				else
				{
					System.out.println("Enter ele = ");
					ele = sc.nextInt();
					r++;
					q[r%max] = ele;
				}
				break;
			case 2:
				if(f>r)
					System.out.println("Queue underflow");
				else
				{
					System.out.println("Deleting = "+q[f%max]);
					q[f%max]=0;
					f++;
				}
				break;
			case 3:
				if(f>r)
					System.out.println("Queue empty");
				else
				{
					System.out.println("ELE");
					for(int i=0;i<max;i++)
						System.out.print(q[i]+"\t");
					System.out.println();
				}
				break;
			case 4: flag=false;break;
			default:System.out.println("Invalid choice");
			
			}
		}
	}
}
