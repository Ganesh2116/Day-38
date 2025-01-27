/*
Q5.Wap input an array now delete  element from array, element is taken from user.
*/

import java.util.Scanner;

class Array6Q5
{
	public static void main(String[] arge)
	{
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the size of array:");
	int size = sc.nextInt();
	
	int a[] = new int[size];

	System.out.println("Enter the elements of array:");
	for (int i=0;i<a.length;i++)
	{
		a[i]= sc.nextInt();
	}
	
	System.out.println("Enter the elements you want delete :");
	int del = sc.nextInt();
	
	for (int i=0;i<a.length;i++)
	{
		if (del == a[i])
		{
			a[i] = -1;
		}
	}
	
	System.out.println("now array is :");
	for (int i=0;i<a.length;i++)	
	{
		if (a[i] != -1)
		{
			System.out.print(a[i]+" ");
		}
	}
	}
}