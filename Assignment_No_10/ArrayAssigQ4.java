// Q4. Wap enter an array and find the second max element.

class ArrayAssigQ4
{
	public static void main(String[] arge)
	{
	int a[] = {11,3,5,8,9,34,78};

	// firsr way
	/*for (int i=0;i<a.length;i++)
	{
		for (int j=i+1;j<a.length;j++)
		{
			if (a[i]<a[j])
			{
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
	}
	
	System.out.println("second max order Array"+a[1]);
	*/
	
	// 2nd way
	
	int max =1;
	int sdmax=0;
	
	for (int i=0;i<a.length;i++)
	{
		if (a[i]>max)
		{
			sdmax = max;
			max = a[i];
			
		}
		if (a[i] > sdmax && a[i] != max )
		{
			sdmax= a[i];
		}
	}
	
	System.out.println("second max order Array "+sdmax);

	}
}
