// Q7.Write a java program to find prime number between an array of element.



class Array4Q7
{
	public static void main(String[] arge)
	{
	int a[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
	
	System.out.println("In Arrays prime numbers are :");
	for (int i=0;i<a.length;i++)
	{
		int count = 0;
		for (int j=1;j<=a[i];j++)
		{
			if (a[i]%j == 0)
			{
				count++;
			}		
		}
		
		if (count == 2)
		{
			System.out.print(a[i]+" ");
		}
	}
	
	}
}