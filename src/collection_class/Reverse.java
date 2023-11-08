package collection_class;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String s=" i am ashutotosh";
     String[] str=s.split(" ");
     String res =" ";
     
     for(int i=0;i<str.length;i++)
     {
    	 res=res+reverse(str[i]+" ");
     }
     System.out.println(res);
	}
    public static String reverse(String s)
    {
    	String res=" ";
    	for(int i=s.length()-1;i>=0;i--)
    	{
    		res=res+s.charAt(i);
    	}
    	return res;
    }
}
