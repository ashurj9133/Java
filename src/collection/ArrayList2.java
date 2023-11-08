package collection;

import java.util.ArrayList;

public class ArrayList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ArrayList al=new ArrayList();
       al.add(10);
       al.add("as");
       al.add('e');
       al.add("rm");
       al.add(10.2);
       al.add(10.2f);
       ArrayList al1=new ArrayList();
       ArrayList al2=new ArrayList();
       
       for(Object o:al)
       {
    	   if(o instanceof String)
    	   {
    		   al1.add(o);
    		   //System.out.println(al1+" ");
    		   //System.out.println(" It is String value: ");
    	   }
    	   else if(o instanceof Integer)
    	   {
    		   al2.add(o);
    		   //System.out.println(al2+" ");
    	   }
    	   else if(o instanceof Character)
    	   {
    		  //System.out.println("it is character value"); 
    	   }
    	   System.out.println(al1+" ");
    	   System.out.println(al2+" ");
       }
	}

}
