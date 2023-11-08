package upcasting;
class Demo1{
	String name;
	Demo1()
	{}
	Demo1(String name){
		this.name=name;
	}
}
class Mango extends Demo1{
     String origin;
	Mango(String name,String origin) {
		//super(name);
		this.name=name;
	this.origin=origin;
	}	
}

class Demo{
	public static void main(String[]args) {
	Demo1 f=new Mango("sss","ss");
	Mango m=(Mango)f;
	//System.out.println(f.name);
	}
}

