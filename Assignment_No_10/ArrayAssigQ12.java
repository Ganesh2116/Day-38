// Q12. Wap to input an array and find its average of first 5 element.


import java.util.Scanner;
	
class ArrayAssigQ12
{
	public static void main(String[] arge)
	{
	Scanner sc = new Scanner(System.in);	

	System.out.println("Enter the size of arrays:");
	int size = sc.nextInt();	
	
	int a[] = new int[size];
	
	System.out.println("Enter the elements of arrays:");
	for (int i=0;i<a.length;i++)
	{
		a[i] = sc.nextInt();
	}
	
	int sum = 0;
	System.out.println("Arrays is :");
	for (int i=0;i<a.length;i++)
	{
		if (i <=4)
		{
			sum = sum + a[i];
		}
		
		System.out.print(a[i]+" ");
	}
	
	System.out.println("\nfirst Five elements Average is : "+sum/5);
	}
}