/*
Q.3 Find the majority element in the array. A majority element in an array A[] of size n is an element that appears more than n/2 times (and hence there is at most one such element).
Examples :

Input : {3, 3, 4, 2, 4, 4, 2, 4, 4}
Output : 4
Explanation: The frequency of 4 is 5 which is greater than the half of the size of the array size.
*/

class Array5Q3
{
	public static void main(String[] arge)
	{
	int a[] = {3, 3, 10, 2, 10, 10, 2, 10, 10,10};
	
	
	for (int i=0;i<a.length;i++)
	{
		int count = 0;
		for (int j=i+1;j<a.length;j++)
		{	
			if (a[i] == a[j])
			{	
				count++;
			}	
		}
	
		if (a.length/2 < count+1)
		{
			System.out.println("Output is :"+count+" element is "+a[i]);
		}
		
	}
	
	
	}
}