// Q7.Wap input an array and rotate it in clock wise by any no give by user.

import java.util.Scanner;

class Array6Q7
{
	public static void main(String[] arge)
	{
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the size array:");
	int size = sc.nextInt();
	
	int a[] = new int[size];
	
	System.out.println("Enter the elements array");
	for (int i=0;i<a.length;i++)
	{
		a[i] = sc.nextInt();
	}
	
	System.out.println("Enter how many rotation :");
	int rota = sc.nextInt();
	
	for (int i=1;i<=rota;i++)
	{
		int temp = a[a.length-1];
		for (int j=a.length-1;j>0;j--)
		{
			a[j]=a[j-1];
		}
		a[0] = temp;	
			
	}
	
	System.out.println("Enter the clock rotation array is: ");
	for (int i=0;i<a.length;i++)
	{
		System.out.print(a[i]+" ");
	}
	
	}

}