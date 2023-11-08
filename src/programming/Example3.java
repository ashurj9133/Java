package programming;

public class Example3 {
 public static void main(String[] args)
 {
	int  num=1;
    //+int product=1;
    int product1=1;
	 
	 for(int i=0;i<=3;i++)
	 {
		 for(int j=0;j<=3;j++)
		 {
			 if(j%2!=0)
			 {
			 int num1=2;
			 product1=product1*num1;
			 System.out.print(product1+" ");
			 num++;
			 }
			 else
		 {
			 System.out.print((num) +" ");
			 num++;
		 }
		 }
		System.out.println(); 
	 }
 }
}
