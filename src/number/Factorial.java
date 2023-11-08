package number;

public class Factorial {
	//factorial of given no i.e 4*3*2*1
   public static void main(String[]args)
   {
	   factor(4);
   }
	   public static void factor(int n)
	   {
		   int res=1;
		   for(int i=1;i<=n;i++)
		   {
			   res=res*i;
		   }
		   System.out.println(res);
	   } 
   
}
