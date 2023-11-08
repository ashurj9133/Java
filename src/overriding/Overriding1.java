package overriding;
class Demo{
	
	  void show()
	  {
		  System.out.println("1st method");
	  }
  }


public class Overriding1 extends Demo {
	
//	void show()
//	{
//		System.out.println("2nd method");
//	}
	public static void main(String[] args) {
		Overriding1 v=new Overriding1();
				v.show();

	}
}
