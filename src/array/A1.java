package array;

public class A1 {
   public static void main(String[] args)
   {
	   String[] a;   //datatype[] array_ref_variable; creation
	   a=new String[3];  //array_ref_variable=new datatype[]; declaration
	   a[0]="10";        //value initialization
	   a[2]="ashu";
	   System.out.println(a);
	   System.out.println(a.length);
	   for (int i=0;i<a.length;i++)
	   {
		   System.out.println(a[i]);
	   }
	   for(String i:a)
	   {
		 System.out.println(i);  
	   }
   }
}
