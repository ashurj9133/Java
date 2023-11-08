package exception;



public class Test {

	public static void main(String[] args) {
	   int n=124689;
	   int sum=0;
	   while(n%2==0)
	   {
		int  last=n%10;
		   sum=sum+last;
		   n=n/10;
		    
		      
	   }
	   System.out.println(sum);
	  }
          }