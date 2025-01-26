/*
Q3.Write a Java program to find the sum of the two elements of a given array which is equal to a given integer.
   Sample array: [1,2,4,5,6]
   Target value: 6.
*/

class Array4Q3
{
	public static void main(String[] arge)
	{
	int a[] = {1,2,3,4,5,6};
	
	System.out.println("Target value : 6");
	
	for (int i=0;i<a.length;i++)	
	{
		for (int j=i+1;j<a.length;j++)
		{
			if((a[i]+a[j]) == 6)
			{
				System.out.println(a[i]+" "+a[j]);
			}
		}
	}	
	
	}
}