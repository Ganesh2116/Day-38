/*Q4.Wap sort half array in accending and half in decending order
    input= int [] a={9,1,3,5,6,11,22,66,10,19}.
    output={1,3,5,6,9,10,66,22,19,11,10},*/

class Array6Q4
{
	public static void main(String[] arge)
	{
	int a[] = {9,1,3,5,6,11,22,66,10,19};
	
	for (int i=0;i<a.length;i++)
	{
		for (int j=i+1;j<a.length;j++)
		{
			if (i > (a.length-1)/2 )
			{
				if(a[i]<a[j])
				{
					int temp = a[i];
					a[i] = a[j];	
					a[j] = temp;
				}
			}
			else 
			{
				if(a[i]>a[j])
				{
					int temp = a[i];
					a[i] = a[j];	
					a[j] = temp;
				}
			}	
		}
		
	}
	
	System.out.println("Now arrays is :");
	for (int i=0;i<a.length;i++)
	{
		System.out.print( a[i]+" ");
	}
	}
}