
class DescendingOrder
{
	public static void main(String[] arge)
	{
	int a[] = {11,3,5,8,9,34};

	for (int i=0;i<a.length;i++)
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
	
	System.out.println("Descending order Array");
	for (int k=0;k<a.length;k++)
	{	
		System.out.print(a[k]+" ");
	}
	}
}
