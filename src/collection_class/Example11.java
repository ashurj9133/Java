package collection_class;

public class Example11 {
	
	String pr;
	int size;
	public void perform()
	{
		System.out.println(" i am");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Example11 e=new Example11();
    e.pr="inter";
    e.size=12;
    e.perform();
    e.dell();
    e.hp();
	}
	public void dell()
	{
		System.out.println("features");
		System.out.println("processor: "+ pr);
		System.out.println("size: "+size);
	}
	public void hp()
	{
		System.out.println("Feat");
		System.out.println("processor: "+ pr);
		System.out.println("size: "+size);
		
	}

}
