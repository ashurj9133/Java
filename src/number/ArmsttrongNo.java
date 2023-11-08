package number;

public class ArmsttrongNo {

	public static void main(String[] args) {
      int no=10,length=0;
      int t1=no;
      while(t1!=0)
      {
    	  t1=t1/10;
    	 length=length+1;
      }
      System.out.println(length);
      int t2=no,rem,sum=0;
      while(t2!=0) {
    	  int mul=1;
    	  rem=t2%10;
    	  for(int i=1;i<=length;i++) {
    		  mul=mul*rem;
    	  }
    	  sum=sum+mul;
    	  t2=t2/10;
      }
      if(sum==no)
      {
    	  System.out.println("armstrong no");
      }
      else
      {
    	  System.out.println("not a armstrong no");
      }
	}

}
