package collection;

import java.util.ArrayList;

import java.util.ListIterator;


public class ArrayList4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ArrayList al=new ArrayList();
    al.add(10);
    al.add("ashu");
    al.add("anuj");
    al.add(20);
    
    ListIterator itr=al.listIterator();
//    itr.next();
//    itr.next();
//    itr.next();
//    itr.next();
    while(itr.hasNext())
    {
    itr.next();
    }
    //System.out.println("-----------");
    while(itr.hasPrevious())
    {
     System.out.println(itr.previous());
	}
    itr.set(200);
    //itr.set("lali");
    System.out.println(al);
	}
}
