package array;

public class Assisment_IndexPos6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] a= {12,34,45,23,56};
		int index_pos=2;
		int element=123;
		for(int i=a.length-1;i<index_pos;i--)
		{
			a[i]=a[i-1];
		}
		a[index_pos]=element;
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}
