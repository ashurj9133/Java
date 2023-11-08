package testYantra;

public class DuplicateString {

	public static void main(String[] args) {
	String input="programming";
     duplicate(input);
	}
	public static void duplicate(String str)
	{
		for(int i=0;i<str.length();i++)
		{
			char current=str.charAt(i);
			if(str.lastIndexOf(current)!=i)
			{
				System.out.println(current+" more than once");
			}
		}
		
	}

}
