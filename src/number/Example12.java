package number;
import java.util.*;
public class Example12 {
   public static void main(String[]args) {
	Scanner s=new Scanner(System.in);
	 //System.out.println("enter any no: ");
	 
	int  h=s.nextInt();
	  // int c=18,temp=c; 
	  int temp=h;
	   int sum=0;
	   while(h!=0)
	   {
		   temp=h%10;
		   sum=sum+temp;
		   h=h/10;
	   }
	   if(temp%sum==0)
	   {
		   System.out.println(" is harshed no");
	   }
	   else
		   System.out.println(" is not a harshad no");
   }
   
}
