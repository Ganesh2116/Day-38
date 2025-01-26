// Q1.Write a Java program to check if an array of integers without 0 and -1.

import java.util.Scanner;
	
class Array4Q1
{
	public static void main(String[] arge)
	{
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter the size of array :");
	int size = sc.nextInt();	
		
	int a[] = new int[size];
	
	System.out.println("Enter the element of array :");
	for (int i=0;i<a.length;i++)
	{
		a[i] = sc.nextInt();
	}
	
	int count = 0;
	
	for (int i=0; i<a.length;i++)
	{
		if (a[i] == 0 && a[i] == 1)
		{
			count++;
		}
	}
	
	if (count >0)
	{
		System.out.println("This array of integers without 0 and -1");
	}
	else 
	{
		System.out.println("This array of intergets with 0 and -1");
	}
	}
}