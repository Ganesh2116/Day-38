/* Q.6 Write a Java program to separate even and odd numbers of a given array of integers. Put all even numbers first, and then odd numbers*/

import java.util.Scanner;

class Array4Q6
{
	public static void main(String[] arge)
	{
	Scanner sc = new Scanner(System.in);	
	
	System.out.println("Enter the size of array :");
	int size = sc.nextInt();
	
	int a[] = new int[size];
	int an[] = new int[a.length];
	
	System.out.println("Enter the elements of array :");
	for (int i=0;i<a.length;i++)
	{
		a[i] = sc.nextInt();	
	}
	
	int ecount = 0 ;
	
	for (int i=0;i<a.length;i++)	
	{
		if (a[i]%2 == 0)
		{	
			an[ecount] = a[i];
			ecount++;	
		}
	}
	
	int ocount = ecount;

	for (int i=0;i<a.length;i++)
	{
		if (a[i]%2 != 0)
		{
		an[ocount] = a[i];
		ocount++;
		}
	}

	
		
	for (int i=0;i<an.length;i++)
	{
		System.out.print(an[i]+" ");
	}
	}
}