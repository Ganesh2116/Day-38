/*Q.5 Write a Java program to check if an array of integers contains two specified elements 65 and 77.*/


import java.util.Scanner;

class Array4Q5
{
	public static void main(String[] arge)
	{
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the size of array :");
	int size = sc.nextInt();

	int a[] = new int[size];
	
	System.out.println("Enter  the elements of arrays:");
	for (int i=0;i<a.length;i++)
	{
		a[i] = sc.nextInt();
	}
	
	for (int i=0;i<a.length;i++)	
	{
		if (a[i] == 65)
		{
			System.out.println("In arrays 65 elements are present in this index "+i);
		}
		else if (a[i] == 77)
		{
			System.out.println("In arrays 77 elements are present in this index "+i);
		}
	}
	
	}
}