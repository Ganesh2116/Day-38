/*
Q8. WAP input 10 name and print with index
    Index       name
*/ 
import java.util.Scanner;

class ArrayAssigQ8
{
	public static void main(String[] arge)
	{
	Scanner sc = new Scanner(System.in);
	
	String a[] = new String[10];
	
	System.out.println("Enter the names :");
	for (int i=0;i<a.length;i++)
	{
		a[i]= sc.nextLine();
	}
	
	System.out.println("Arrays is  :");
	System.out.println("Name  Index ");
	for (int i=0;i<a.length;i++)
	{
		System.out.println(a[i]+"  "+i);
	}
	}
	
}