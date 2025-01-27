// Q8.Wap input an array and delete all duplicate element from array.

import java.util.Scanner;

class Array6Q8
{
	public static void main(String[] arge)
	{
	Scanner sc = new Scanner(System.in);	
	
	System.out.println("Enter the Size of array");	
	int size = sc.nextInt();
	
	int a[] = new int[size];	
	
	System.out.println("Enter elements of array");
	for (int i=0;i<a.length;i++)
	{
		a[i] = sc.nextInt();
	}
	
	for (int i=0;i<a.length;i++)
	{
		for (int j=i+1;j<a.length;j++)
		{
			if (a[i] == a[j])
			{
				a[i] = -1;
			}
		}
	}
	
	System.out.println("Now array is :");
	for (int i=0;i<a.length;i++)
	{	
		if (a[i] != -1)
		System.out.print(a[i]+" ");
	}
	}
}