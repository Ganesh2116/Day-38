/*
Q3.a[]={10,20,30,40,50}
   b[]={1,2,3,4,5}
 
  output array=c[]={10,5,20,4,30,3,40,2,50,1}
*/


class Array6Q3
{
	public static void main(String[] arge)
	{
	int a[] ={10,20,30,40,50};
	int b[] ={1,2,3,4,5};
	int br[] = new int[b.length];
	int c[] = new int[a.length+b.length];
	int an =0;
	int brn =0;

	for (int i=0;i<b.length;i++)
	{
		br[b.length-1-i] = b[i];	
	} 
		
	for (int i=0;i<c.length;i++)
	{
		if (i%2 == 0)
		c[i] = a[an++];
		else 
		c[i] = br[brn++];
	}
	
	
	System.out.println("Arrays is :");
	for (int i=0;i<c.length;i++)
	{
		System.out.print(c[i]+" ");
	}
	}
}