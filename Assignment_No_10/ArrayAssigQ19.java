/*
Q19.a[]={10,20,30,40,50}
   b[]={1,2,3,4,5}
 
  output array=c[]={10,5,20,4,30,3,40,2,50,1}
*/

class ArrayAssigQ19
{
	public static void main(String[] arge)
	{
	int a[]={10,20,30,40,50};
  	int b[]={1,2,3,4,5};
	
	int c[] = new int[a.length+b.length];
	
	int an = 0;
	int bn = 0;
	int bnn = b.length-1;
	int br[] = new int[b.length];

	for (int i=0 ;i<b.length;i++)
	{
		br[bnn] = b[i];
		bnn--;	
	}
	

	for(int i=0;i<c.length;i++)
	{
		if(i%2 != 0)
		{
			c[i] =br[bn];
			bn++;

		}
		else 
		{
			c[i] = a[an];
			an++;
		}
	}
	
	System.out.println("Arrays is c :");
	for (int i=0;i<c.length;i++)
	{
		System.out.print(c[i]+" ");
	}
	}
}