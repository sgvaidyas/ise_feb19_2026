package com.ds;

import java.util.Scanner;

public class Stack {

	public static void main(String[] args) {
		final int max=5; //size 
		int[] stk = new int[max]; //initialized array with 5 val
		int top=-1;
		boolean flag=true;
		int ch;
		Scanner sc = new Scanner(System.in);
		while(flag)
		{
			System.out.println("1 PUSH 2 POP 3 DISPLAY 4 EXIT ");
			System.out.println("Enter the choice ");
			ch=sc.nextInt();
			int ele;
			switch(ch)
			{
			case 1:
				if(top== max-1)
						System.out.println("Stack overflow");
				else
				{
					System.out.println("Enter the ele = ");
					ele = sc.nextInt();
					top++;
					stk[top]=ele;
				}
				break;
			case 2:
				if(top == -1)
					System.out.println("Stack underflow");
				else
				{
					System.out.println("Deleting = "+ stk[top]);
					top--;
				}
				break;
			case 3:
				if(top==-1)
					System.out.println("Stack empty");
				else
				{
					System.out.println("Elements of stack");
					for(int i = top ; i>=0;i--)
						System.out.println(stk[i]);
				}
				break;
			case 4:flag=false;
			    break;
			default:
				System.out.println("Invalid choice");
			}
		}

	}

}
