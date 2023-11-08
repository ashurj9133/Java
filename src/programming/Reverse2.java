package programming;

public class Reverse2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s="java";
        String[] str=s.split("      ");
        int count=0;
        String s1="java";
        for(int i=0;i<str.length;i++)
        {
        	
        	if(s1.equals(str[i]))
        	{
        		count++;
        	}
        }
        System.out.println(count);
        
	}

}
