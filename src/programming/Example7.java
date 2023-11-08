package programming;

public class Example7 {
  public static void main(String[]args)
  {
	  System.out.println(Factors(6));
  }
  public static int Factors(int n)
  {
	  int sum=0;
	  for(int i=1;i<=n;i++)
	  {
		  if(n%i==0)
		  {
			  sum=sum+i;
		  }
	  }
	  return sum;
  }
}
