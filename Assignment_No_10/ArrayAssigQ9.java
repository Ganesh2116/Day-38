// Q9. Wap to input an array and print it.


import java.util.Scanner;

class ArrayAssigQ9
{
	public static void main(String[] arge)
	{
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the size of array:");
	int size = sc.nextInt();	
	
	int a[] = new int[size];
	
	System.out.println("Enter the elements here :");
	for (int i=0;i<a.length;i++)
	{	
		a[i] = sc.nextInt();
	}
	
	System.out.println("Arrays is :");
	for (int i=0 ;i<a.length;i++)
	{
		System.out.print(a[i]+" ");
	}
	}
}