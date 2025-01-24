// Q11. WAP input 10 elements and multiply 5th elements by 25.

import java.util.Scanner;

class ArrayAssigQ11
{
	public static void main(String[] arge)
	{
	Scanner sc = new Scanner(System.in);
	
	int a[] = new int[10];
	
	System.out.println("Enter the elements here :");
	for (int i=0;i<a.length;i++)
	{	
		a[i] = sc.nextInt();
	}
	
	System.out.println("Arrays is :");
	for (int i=0 ;i<a.length;i++)
	{
		if (i == 4)
		{	
			a[i]=a[i]*25;
		}
		System.out.print(a[i]+" ");
	}
	}
}
