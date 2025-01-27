/* Q10.Wap input an array now insert any element at any position ,
    element and position is taken by user.*/

import java.util.Scanner;

class Array6Q10
{
	public static void main(String[] arge)
	{
	Scanner sc = new Scanner(System.in);	
	
	System.out.println("Enter the size of array:");
	int size = sc.nextInt();
	
	int a[] = new int[size];	
	
	System.out.println("Enter the elements arrays:");
	for (int i=0;i<a.length;i++)
	{
		a[i] = sc.nextInt();
	}
	 
	
	System.out.println("Enter the element is :");
	int ele = sc.nextInt();
	
	System.out.println("Enter the position is :");
	int pos = sc.nextInt();
	
	int arr[] = new int[a.length+1];
	for (int i=0,j=0;i<arr.length;i++)
	{	
		if (i == pos-1)
		{
			arr[i] = ele;
		}
		else
		{
			arr[i] = a[j];
			j++;
		}
			
	}
		
	System.out.println("now array is:");
	for (int i=0;i<arr.length;i++)
	{
		System.out.print(arr[i]+" ");
	}

	}
}