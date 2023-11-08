package part2;

public class Example4 {
    public static void main(String[]args)
    {
    	System.out.println("main starts");
    	int[]ar= {12};
    	try {
    		System.out.println(ar[0]);
    		String s="j";
    		try {
    			System.out.println(s.charAt(0));
    		}
    		catch(StringIndexOutOfBoundsException e) {
    			System.out.println(e);
    		}
    	}
    	catch(ArrayIndexOutOfBoundsException e) {
    		System.out.println(e.getMessage());
    	}
        System.out.println("main ends");
    }  
}
