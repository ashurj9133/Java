package collection_class;

interface T
{
	 void m1();	
}
interface D
{
	 void m2();	
}
class Remo implements T,D
{   
	public void m1()
	{
		System.out.println("i ss");
	}
	public void m2()
	{
		System.out.println("i am ssasaram");
	}
}
public class Driver1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Remo r=new Remo();
		r.m1();
		r.m2();
	

	}

}

