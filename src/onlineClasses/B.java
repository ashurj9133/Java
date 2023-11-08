package onlineClasses;

public class B {
	private int a=10;
    public int getA()
    {
    	return a;
    }
	public void setA(int a)
	{
		this.a=a;
	}
	

	public static void main(String []args)
	{
		B c=new B();
		System.out.println(c.a);
		System.out.println(c.getA());
		c.setA(25);
		System.out.println(c.getA());
		
	}
	}