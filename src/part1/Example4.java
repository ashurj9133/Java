package part1;

public class Example4 {
public static void main(String[]args)
{
	int a[]={11,2,13,4,15,6,9,12};
	for (int i=0;i<a.length;i++)
	{
		if (a[i]%2==0)
		{
			a[i]=a[i]-1;
			//System.out.println(a[i]+" ");
			//System.out.println();
		}
		else
		{
			a[i]=a[i]+1;
			//System.out.println(a[i]+" ");
		}
		System.out.println(a[i]+" ");
	}
}
}
