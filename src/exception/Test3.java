package exception;
class UnderAgeException extends RuntimeException
{
	UnderAgeException()
	{
	super("you are idot");
	}
	UnderAgeException(String msg)
	{
		super(msg);
	}
	}
class Test3 {

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
    	   System.out.println("you are eligible");
       }
	   System.out.println("i a unchecked");
	}
	catch(UnderAgeException e)
	{
		e.printStackTrace();
	}

}
}    
