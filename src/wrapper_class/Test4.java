package wrapper_class;

class UnderAgeException extends Exception
{
	 UnderAgeException()
	 {
		 super("you are not eligible");
	 }
	 UnderAgeException(String msg)
	 {
		 super("you are 123");
	 }
}
public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
      int age=16;
      if(age<18)
      {
   	   throw new UnderAgeException();
      }
      else
      {
   	   System.out.println("you are not eligible");
      }
		}
		catch(UnderAgeException e)
		{
			e.printStackTrace();
			System.out.println("you are voted as chutiya");
		}
	}

}


