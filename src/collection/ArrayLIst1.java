package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayLIst1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		al.add(10);
		al.add("ashu");
		al.add(40);
		al.add("ramesh");
		
      ListIterator itr=al.listIterator();
      while(itr.hasNext())
      {
    	  System.out.println(itr.next());
    	  //itr.remove();
    	  //al.remove("ashu");
      }
      //itr.set(2);
      itr.remove();
      System.out.println(al);
      //al.remove("ashu");
      //System.out.println(al);
      //System.out.println(itr.next());
      //itr.remove();
      System.out.println(al);
      //System.out.println(al);
      
      
	}

}
