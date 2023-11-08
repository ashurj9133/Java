package collection_class;

import java.util.LinkedList;

public class Al3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         LinkedList l=new LinkedList();
         l.add(1);
         l.add("ashu");
         l.add("23lpa");
         l.add(1.65);
         l.add(345);
         l.add(56f);
         System.out.println(l);
         LinkedList al=new LinkedList();
         al.add("raja");
         al.add("king");
         al.add(222);
         al.add(111);
         al.addAll(l);
         System.out.println(al.add(l));
         l.remove();
         System.out.println(l);
	}

}
