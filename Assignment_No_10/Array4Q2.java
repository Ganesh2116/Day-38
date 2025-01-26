/* Q2. Write a Java program to remove the duplicate elements of a given array and print the       new length of the array.
    Sample array: [20, 20, 30, 40, 50, 50, 50]*/

class Array4Q2
{
	public static void main(String[] arge)
	{
	int a[] = {20,20,30,40,50,50,50};
	int count = 0;
	
	
	for (int i=0;i<a.length;i++)
	{
		for (int j=i+1;j<a.length;j++)
		{
			if (a[i] == a[j])
			{
				count++;	
			}	
		}
	}
	
	System.out.println(count);
	int b[] = new int[count];
	
	int k =0;

	for (int i=0;i<a.length;i++)
	{	
		
		for (int j=i+1;j<a.length;j++)
		{
			if (a[i] != a[j])
			{
				if (k >5)
				b[k++] = a[j];	
				break;
			}
				
		}
	}
	
	System.out.println("New Array is :");
	for (int i=0;i<count;i++)
	{
		System.out.print(b[i]+" ");
	}
	
	}
}