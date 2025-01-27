// Q9. Write a Java program to find max number in an array.

class Array6Q9
{
	public static void main(String[] arge)
	{
	int a[] = {10,20,60,80,90,110,30,50,40,60};
	int max =0;
	for (int i=0;i<a.length;i++)
	{
		if (a[i] > max)
		{
			max = a[i];
		}
		
	}
	
	System.out.println("max elements in array is :"+max);
	
	}
}