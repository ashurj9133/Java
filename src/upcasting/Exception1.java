package upcasting;
import java.util.Scanner;
class FirstGrowException extends RuntimeException
{
	FirstGrowException(String s)
	{
		super("you are damm hero");
	}
}
class NoUseException extends Exception
{ 
	NoUseException(String s)
	{
		super(s);
	}
}
class Tinder{
	 void isAgeValid(int age)throws Exception
	 {
		if(age<18)
		{
		throw new FirstGrowException("you are not eligible");
		}
		else if(age>=18&&age<40)
		{
			System.out.println("You are legend");
		}
		else if(age>40)
		{
			throw new NoUseException("you are eligible");
		}
	}
}

public class Exception1 {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name=s.nextLine();
		System.out.println("Enter your age: ");
		int age=s.nextInt();
       Tinder y=new Tinder();
       try
       {
    	    
    	y.isAgeValid(age); 
    	System.out.println();
 
       }
       catch(Exception e)
       {
    	   e.printStackTrace();
    	   System.out.println("hello");
    	   System.err.println(e);
       }
	}

}
