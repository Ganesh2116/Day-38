/* Q16.Wap enter an array and print the square of the element which is present at odd position*/
	
import java.util.Scanner;

class ArrayAssigQ16
{
	public static void main(String[] arge)
	{
	Scanner sc = new Scanner(System.in);
	int a[] = new int[10];
	
	System.out.println("Enter the elements :");	
	for (int i=0;i<a.length;i++)	
	{
		a[i] = sc.nextInt();
	}
	
	System.out.println("Arrays is :");
	for(int i=0;i<a.length;i++)
	{
		System.out.print(a[i]+" ");

	}
	
	for (int i=0;i<a.length;i++)
	{
		if ((i+1)%2 != 0)
		{
			a[i]=a[i]*a[i];
		}
	}
 	
	
	System.out.println("\nSquare of the odd positions :");
	for(int i=0;i<a.length;i++)
	{
		System.out.print(a[i]+" ");

	}
	
	}
}