/*
Q4.Write a Java program to print all the LEADERS in the array.
  Note: An element is leader if it is greater than all the elements to its right side.
*/

import java.util.Scanner;

class Array4Q4
{
	public static void main(String[] arge)
	{
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the size of array:");
	int size = sc.nextInt();
	
	int a[] = new int[size];
	
	System.out.println("Enter the elements of array :");
	for (int i=0;i<a.length;i++)	
	{
		a[i] = sc.nextInt();
	}
	
	System.out.println("leasder of greater than right side :");
	for (int i=a.length-1;i>0;i--)
	{
		for (int j=i-1;j>0;j--)
		{
			if (a[j]>a[i])
			{
				System.out.println(a[i]+" ");
			}
		}
	}
	}
}