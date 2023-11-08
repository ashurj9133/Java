package part1;

public class Example3 {
public static void main(String[]args)
{
	int a[]= {111,220,50,225,635,5500};
	int largest=a[0];
	for(int i=1;i<a.length;i++)
	{
		if (a[i]>largest)
		{
			largest=a[i];
		}
		
	}
	System.out.println("largest no is "+largest);
	
	}
}
