package array;

public class Assisment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int [] a= {10,20,30,34,23,45,67};
   int pos=3;
   int new_value=65;
		for(int i=a.length-1;i>pos-1;i--)
		{
			a[i]=a[i-1];
		}
		a[pos-1]=new_value;
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}
