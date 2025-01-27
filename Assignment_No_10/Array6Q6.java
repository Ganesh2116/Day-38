// Q6.Wap input an array and rotate it in anti clock wise by any no give by user.

import java.util.Scanner;

class Array6Q6
{
	public static void main(String[] arge)
	{
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the size of array");
	int size = sc.nextInt();
	
	int a[] = new int[size];
	
	System.out.println("Enter the elements of array:");
	for (int i=0;i<a.length;i++)
	{
		a[i] = sc.nextInt();
	}
	
	System.out.println("Enter the how many time to rotation:");
	int rota = sc.nextInt();
	
	for (int i=1 ;i<=rota;i++)
	{
		int temp = a[0];	
	
		for (int j=0;j<a.length-1;j++)
		{
			a[j]=a[j+1];
		}
		a[a.length-1] = temp;
	} 
	
	System.out.println("AntiClockWise roation :");
	for (int i=0;i<a.length;i++)
	{
		System.out.print(a[i]+" ");
	}
	}
}

