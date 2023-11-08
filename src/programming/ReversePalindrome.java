package programming;

public class ReversePalindrome {
	   //reverse string
	  //palindrome string  101,121 ka reverse 101,121

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="101";
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		//System.out.println(rev);
        if(s.equals(rev))
        {
        	System.out.println("it is palindrome String");
        }
        else
        {
        	System.out.println("it is not palindrome String");
        }
	}

}
