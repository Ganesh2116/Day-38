/*
Q4.Write a Java program to print all the LEADERS in the array.
  Note: An element is leader if it is greater than all the elements to its right side.
*/

class Array4Q4
{
	public static void main(String[] arge)
	{
	int a[] = {5,22,6,17,11,15,16};		
	
	System.out.println("leader greater than all elements is :");
	for (int i=0;i<a.length;i++)
	{
		int j ;
		for (j=i+1;j<a.length;j++)
		{
			if (a[i]<a[j])
			{
			break;
			}
		}
		if (j == a.length)
		{
			
			System.out.print(a[i]+" ");
		}	
	}
	
	}
}