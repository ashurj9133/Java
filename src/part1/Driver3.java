package part1;

class Demo
{
	int no;
	String name;
	
	 void setValue(int no,String name)
	{
		this.no=no;
		this.name=name;
	}
	void display()
	{
		System.out.println(no);
		System.out.println(name);
	}
	}
class Driver3
{
	public static void main(String[]args)
	{
		Demo f=new Demo();
		f.setValue(12,"ashu");
		f.display();
	}
	}

