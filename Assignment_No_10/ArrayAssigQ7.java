// Q7. WAP Input 10 elements in float and print it;

import java.util.Scanner;

class ArrayAssigQ7
{
	public static void main(String[] arge)
	{
	Scanner sc = new Scanner(System.in);
	float a[] = new float[10];

	System.out.println("Enter values of elements: ");
	for (int i=0;i<a.length;i++)
	{
		a[i] = sc.nextFloat();
	}
	
	System.out.println("Arrays is :");
	for (int i=0;i<a.length;i++)
	{
		System.out.print(a[i]+" ");
	}	
	}
}