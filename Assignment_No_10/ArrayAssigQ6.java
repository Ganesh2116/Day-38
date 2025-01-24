// Q6. Wap enter an array and find max and min element.

class ArrayAssigQ6
{
	public static void main(String[] arge)
	{
	int a[] = {11,3,5,8,9,34,78};

	int min =a[0];
	int max =0;
	
	for (int i=0;i<a.length;i++)
	{
		if (a[i]<min)
		{
			min = a[i];
			
		}
		if (a[i]>max)
		{
			max = a[i];
			
		}

	}
	
	System.out.println("max element is  "+max);
	System.out.println("min element is "+min);

	}
}