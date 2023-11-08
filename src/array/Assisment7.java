package array;

public class Assisment7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[]a= {13,23,45,56,34};
      int delete=45;
      for(int i=0;i<a.length;i++)
      {
    	  if(delete==a[i])
    	  {
    		  for(int j=0;j<a.length-1;j++)
    		  {
    			  a[i]=a[j+1];
    		  }
    		  break;
    	  }
      }
      for(int i=0;i<a.length-1;i++)
      {
    	   System.out.print(a[i]+" ");
      }
		
	}
}
