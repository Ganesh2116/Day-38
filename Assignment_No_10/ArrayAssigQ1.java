// Q1. WAP to merge two Array and print the final array.


class ArrayAssigQ1
{
	public static void main(String[] arge)
	{
	int a[] = {1,2,3,4,5,10,13,78};
	int b[] = {6,7,8,9,10,11,12,6,7,8,9};
	int c[] = new int[a.length+b.length];
			
	for (int i=0;i<a.length;i++)
	{	
		c[i] = a[i];
	}
	
	for (int i=0;i<b.length;i++)
	{	
		c[i+a.length] = b[i];
	}
	
	System.out.println("Merge arrays is:");
	for (int i=0;i<c.length;i++)
	{
		System.out.print(c[i]+" ");
	}
	}
}