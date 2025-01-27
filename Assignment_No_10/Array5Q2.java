/*
Q2.Given an array of integers arr[], The task is to find the index of first repeating element in it i.e. the element that occurs more than once and whose index of the first occurrence is the smallest.
*/


class Array5Q2
{
	public static void main(String[] arge)
	{
	int a[] ={8, 6, 4, 3, 4, 6, 7, 8};
	
	int rep = -1;
	
	for (int i=0;i<a.length;i++)
	{
		for(int j=i+1;j<a.length;j++)
		{
			if (a[i] == a[j])
			{
				 
				if (rep == -1 || i < rep) 
				{
                       			 rep = i;
				}
			}
		}
		
	}
	
	if (rep == -1)
	{
		System.out.println("Repeating array not found!");
	}
	else 
	{
		 System.out.println("The index of the first repeating element is: " +rep);
           	 System.out.println("The first repeating element is: " + a[rep]);
	}
	}
}