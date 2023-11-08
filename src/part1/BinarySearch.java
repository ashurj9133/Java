package part1;

public class BinarySearch {
	public static void main(String[]args)
	{
		int[]a= {1,2,3,4,5,6,7,8,9,10,11,12};
		int month=9;
		int li=0;
		int hi=a.length-1;
		int mi=(li+hi)/2;
		while (li<=hi)
		{
		if(a[mi]==month)
		{
			System.out.println("Month is at "+mi+" index position");
			break;
			}
		else if(a[mi]<month)
		{
			li=mi+1;
		}
		else
		{
			hi=mi-1;
		}
		mi=(li+hi)/2;
		}
		if (li>hi)
		{
			System.out.println("Months is not present");
		}
	}

    }
