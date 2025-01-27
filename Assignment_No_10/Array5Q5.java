/*
Q5.Given an array and a value, find if there is a triplet in array whose sum is equal to the given value.
If there is such a triplet present in array, then print the triplet and return true. Else return false.

Examples:
 

Input: array = {12, 3, 4, 1, 6, 9,12,8,4}, sum = 24;
Output: 12, 3, 9
*/

class Array5Q5
{
	public static void main(String[] arge)
	{
	int a[] ={12, 3, 4, 1, 6, 9,12,8,4};
	
	
	int sum =0;
	for (int i=0;i<a.length;i++)
	{
		for (int j=i+1;j<a.length;j++)
		{
			for (int k=j+1;k<a.length;k++)
			{
				sum = a[i]+a[j]+a[k];
				if (sum == 24)
				{
					System.out.print("\nelements is :"+a[i]+" "+a[j]+" "+a[k]);
				}
				
			}

		}
	}
	}
}