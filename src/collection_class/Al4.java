package collection_class;

class Desk{
	Desk(Al4 t)
    {
		System.out.println("i am m1");
	}
   }
 class Al4{
	
	void demo()
	{
		Desk t=new Desk(this);
	
		System.out.println("hello");
	}
	public static void main(String[] args) {
	   Al4 t=new Al4();
		t.demo();
	}
}
