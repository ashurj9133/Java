package part1;

class Driver1
{
	void show(int a)
	{
		System.out.println("from a");
	}
	void show()
	{
		System.out.println("from b");
	}
public static void main(String[]args)
{
	Driver1 d=new Driver1();
	d.show();
	}
}