package collection_class;

import java.util.ArrayList;

public class Al {
    public static void main(String[] args)
    {
    	ArrayList al=new ArrayList();
    	al.add(1);
    	al.add(2);
    	al.add(3);
    	al.add(4);
    	al.add(5);
    	al.addAll(al);
    	System.out.println(al);
    	/*ArrayList al2=new ArrayList();
    	al.addAll(al);
    	System.out.println(al.containsAll(al));
    	if (al.containsAll(al))
    	{
    		System.out.println(al.indexOf(0));
    	}*/
    	System.out.println(al.indexOf(0));
    	System.out.println(al.remove(1));
    	System.out.println(al);
    }
}
