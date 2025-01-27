/*
Q1.Given an array and a number K where K is smaller than the size of the array.
   Find the K’th smallest element in the given array. Given that all array elements are distinct.

Examples:  

Input: arr[] = {7, 10, 4, 3, 20, 15}, K = 3
Output: 7
*/


class Array5Q1
{
	public static void main(String[] arge)
	{
	int a[] = {7, 10, 4, 3, 20, 15};
	int k = 3;
	
	//sorted array
	for (int i=0;i<a.length;i++)
	{
		for (int j=0;j<a.length;j++)
		{
			if (a[i]<a[j])
			{
				int temp =a[i];	
				a[i] = a[j];
				a[j] = temp;
			}
		}
	}
	
	System.out.println("Sorted array is :");
	for(int i=0;i<a.length;i++)
	{
		System.out.print(a[i]+" ");
	}
	
	for (int i=0;i<a.length;i++)
	{
		if (k == i+1)
		{
			System.out.println("\nOutput is :"+a[i]);
		}
	}
	
	}
}