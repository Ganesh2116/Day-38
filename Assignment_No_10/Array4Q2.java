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
				a[j] = -1;		
			}	
		}
	}
	
	System.out.print("Duplicate delete array :");
	for (int i=0;i<a.length;i++)
	{
		if (a[i] != -1)
		{
			System.out.print(a[i]+" ");
			count++;
		}	
	}
	System.out.println("\nDuplicate delete array length is :"+count);	
		
	}
}