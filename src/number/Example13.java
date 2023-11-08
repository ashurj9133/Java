package number;


public class Example13 {
 public static void main(String[]args) {
	 factor(17);
 }
 public static void factor(int n)
 {
	 int res=1;
	 for(int i=1;i<n;i++)
	 {
		 res=res*i;
	 }
 
  if(res>10)
  {
	 int flag=0;
	 for(int i=1;i<=n;i++)
	 {
		 if(n%i==0)
		 {
			 flag++;
		 }
	 }
		 if(flag==2)
		 {
			 System.out.println(n+" is prime no");
		 }
		 else
		 {
			 System.out.println(n+" is not a prime no");
		 }
	 
  } 
 }
}
