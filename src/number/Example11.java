package number;

public class Example11 {
  public static void main(String[] args)
  {
	  int n=153;
	  int sum=n;
	  int flag=0;
	  while(sum!=0)
	  {
		  flag=flag+1;
		  sum=sum/10;
	  }
	  int t2=n;
	  int rem;
	  int arm=0;
	  while(t2!=0)
	  {
		 rem=t2%10;
		 int mul=1;
		 for(int i=1;i<=flag;i++)
		 {
			 mul=mul*rem;
		 }
		 arm=arm+mul;
		 t2=t2/10;
	  }
	  if(n==arm)
	  
		  System.out.println(n+" is armstrong no");
	  else
		  System.out.println(n+" is not armstrong no");
  }
}
