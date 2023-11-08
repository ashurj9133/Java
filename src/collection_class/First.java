package collection_class;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class First {
	 
	public static void main(String[] args) {
		TreeSet ts=new TreeSet();
		ts.add(10);
		ts.add(90);
		ts.add(30);
		ts.add(22);
		ts.add(50);
		ts.add(60);
		ts.add(70);
		System.out.println(ts);
		System.out.println(ts.ceiling(11));
		System.out.println(ts);
	    NavigableSet it=ts.descendingSet();
	    
	    System.out.println(it);
	}

}
