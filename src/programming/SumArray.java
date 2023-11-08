package programming;

public class SumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int[] a= {10,20,30};
   int[] b= {40,50,60};
   //int temp;
   int[] c=new int[a.length];
   if(a.length==b.length) {
	   for(int i=0,j=0,k=0;i<a.length;i++,j++,k++) {
		   c[k]=a[i]+b[j];
	      
			   
		   System.out.println(c[k]);
	   }
   }
 	}

}
