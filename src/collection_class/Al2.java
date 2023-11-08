package collection_class;

import java.util.ArrayList;

public class Al2 {
   public static void main(String []args)
   {
	 ArrayList a=new ArrayList();
	 a.add(2);
	 a.add("ashutosh");
	 a.add('d');
	 a.add('A');
	 a.add(true);
	 a.add(5.5);
	 a.add("6.3l");
	 System.out.println(a);
	 System.out.println(a.indexOf(3));
	 System.out.println(a.remove(5.5));
	 System.out.println(a);
   }
}
