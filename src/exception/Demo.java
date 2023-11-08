  package exception;
  public class Demo {  	
	public static void main(String[]args)
	{
		 int n=123456789;
		 int sum=0;
		 for(int i=1;i<=n;i++)
		 {
			 
			 if(i%2==0)
			 {
				 sum=sum+i;
			 }
			 n=n/10;
		 }
		 System.out.println("sum of even no:"+sum);
	}
  }