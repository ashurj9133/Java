package collection_class;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

public class Ar6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] a= {1,2,3,4,5,3,4,5};
      m1(a);
	}
      public static void m1(int[]a)
      {
    	  LinkedHashSet<Integer> hs=new LinkedHashSet();
    	  for(int i=0;i<=a.length-1;i++)
    	  {
    	  if(hs.add(a[i]))
    	  {
    		  System.out.println(a[i]);
    	  }
    	  }
      }
	}


