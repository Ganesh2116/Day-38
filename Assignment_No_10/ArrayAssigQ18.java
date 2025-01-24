// Q18.Wap input two array and merge in third array.

import java.util.Scanner;

class ArrayAssigQ18
{
	public static void main(String[] arge)
	{
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the fist array size :");
	int size = sc.nextInt();	
	
	int a[] = new int[size];

	System.out.println("Enter the elements here :");	
	for (int i=0;i<a.length;i++)	
	{
		a[i] = sc.nextInt();
	}
	
	System.out.println("Enter the 2nd array size :");
	int size1 = sc.nextInt();	
	
	int b[] = new int[size1];

	System.out.println("Enter the elements here :");	
	for (int i=0;i<b.length;i++)	
	{
		b[i] = sc.nextInt();
	}
	
	int c[] = new int[a.length+b.length];
	
	for (int i=0;i<a.length;i++)
	{
		c[i]=a[i];
	}
	
	for (int i=0;i<b.length;i++)
	{
		c[i+a.length]=b[i];
	}
	
	System.out.println("Merage arrays is :");
	for (int i=0;i<c.length;i++)
	{
		System.out.print(c[i]+" ");
	}
	
	}
}