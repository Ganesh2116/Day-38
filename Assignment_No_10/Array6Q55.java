// Q5.Wap input an array now delete  element from array, position is taken from user.

import java.util.Scanner;

class Array6Q55
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

	System.out.println("Enter the position you want delete :");
	int pos = sc.nextInt();
	
	for (int i=0;i<a.length;i++)
	{
		if (i+1 == pos )
		{
			a[i] = -1;
		}
	}
	
	for (int i=0;i<a.length;i++)
	{
		if (a[i] != -1)
		{
			System.out.print(a[i]+" ");
		}
	}
	}
}