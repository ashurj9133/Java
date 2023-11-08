package number;

public class FactorCount {
	//how many times count of factor of given no
  public static void main(String[]args)
  {
	  int count=factor(4);
	  System.out.println(count);
  }
  public static int factor(int n)
  {
	  int count=0;
	  for(int i=1;i<=n;i++)
	  {
		  if(n%i==0)
		  {
			  count++;
		  }
	  }
	  return count;
			  
  }
}
