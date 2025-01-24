// Q5. Wap enter an array and find the second min element.


class ArrayAssigQ5
{
	public static void main(String[] arge)
	{
	int a[] = {11,3,5,8,9,34,78};

	int min =100;
	int sdmin=99;
	
	for (int i=0;i<a.length;i++)
	{
		if (a[i]<min)
		{
			sdmin = min;
			min = a[i];
			
		}
		if (a[i] < sdmin && a[i] != min )
		{
			sdmin= a[i];
		}
	}
	
	System.out.println("second max order Array "+sdmin);

	}
}