package com.ds;

import java.util.Scanner;

public class LinearQueue {

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
			case 1: if(r==max-1)
						System.out.println("Queue overflow");
					else
					{
						System.out.println("Enter the ele = ");
						ele=sc.nextInt();
						r++;
						q[r]=ele;
					}
					break;
			case 2: if(f>r)
				System.out.println("Queue underflow");
				else
				{
					System.out.println("Deleting  = "+q[f]);
					f++;
				}
				break;
			case 3: if(f>r)
						System.out.println("Queue empty");
					else
					{
						System.out.println("Elements = " );
						for(int i=f;i<=r;i++)
							System.out.print(q[i]+"\t");
					}
				break;
			case 4:
				flag=false;
				break;
			default:
				System.out.println("Invalid choice");
			}
		}

	}

}
