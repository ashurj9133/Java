package array;

public class Assisment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b=97;
      int[] a= {10,40,29,34,56,34,54,67,87,};
      int li=0;
      int hi=a.length-1;
      int mi=(li+hi)/2;
      while(li<=hi)
      {
    	  
    	  if(a[mi]==b)
    	  {
     System.out.println("element is present at "+mi+" index positon ");
        break;
    	  }
    	  else if(a[mi]<b)
    	  {
    		  li=mi+1;
    	  }
    	  else
    	  {
    		  hi=mi-1;
    	  }
    	  mi=(li+hi)/2;
      }
      if(li>hi)
      {
    	  System.out.println("element is not present");
      }
	}

}
