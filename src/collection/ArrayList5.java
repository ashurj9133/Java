package collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayList5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ArrayList al=new ArrayList();
    al.add("ashu");
    al.add("lali");
    al.add("anuj");
    al.add("saroj");
    al.add("gajju");
     
    ListIterator it=al.listIterator(al.size());
    //System.out.println(it.previous());
    
    while(it.hasNext())
    {
    	System.out.println(it.next());
    }
    System.out.println();
    while(it.hasPrevious())
    {
    	System.out.println(it.previous());
    }
    System.out.println(al);
    it.add("ramgarh");
    System.out.println(al);
    al.add("mohania");
    System.out.println(al);
	}
}
