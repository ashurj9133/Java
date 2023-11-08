package onlineClasses;

import java.lang.reflect.Array;

public class Arr {

	public static void main(String[] args) {
		String d= "ashutosh";
		String revString="";
          for(int i=d.length()-1;i>=0;i--)
          {
        	  revString=revString+d.charAt(i);
          }
		
		
		System.out.println(revString);
	}

}
