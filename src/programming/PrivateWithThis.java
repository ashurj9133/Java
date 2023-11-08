package programming;

class Test{
	private String name;
	int roll;
	Test()
	{
		
		
	 	System.out.println("i am ashutosh");
	}
	Test(String name)
	{
		this();
		this.name=name;
		//this.roll=roll;
	}
	void display()
	{
		System.out.println("name: "+name);
		System.out.println("roll: "+roll);
	}
}

public class PrivateWithThis {
	public static void main(String[]args) {
		Test t=new Test("ashutosh");
		t.display();
	}

}
