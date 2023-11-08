package programming;

 interface D1 {
  public void m1();
  
	  public static void m2()
	  {
	 System.out.println("i am m1 method"); 
  }
}
 interface D2
{
	 
	public static void m2()
	{
	System.out.println("i am m2 method");
	}
	}
interface D4  extends D1,D2
{
	
	}
class Demo implements D4
{
	public void m1()
	{
		System.out.println(" i am rockstar");
	}
	 public static void main(String[]args)
	{
		D1 d=new Demo();
		d.m1();
		D1.m2();
		D2.m2();
		
	}
	
}

