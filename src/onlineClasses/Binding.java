package onlineClasses;
class superClass{
public static void show()
{
	System.out.println("super class created");
}
}
public class Binding extends superClass{
		
	public static void show()
	{
		System.out.println("sub class is created");
	}

	public static void main(String[] args) {
		superClass su=new superClass();
		su.show();
		superClass binding=new Binding();
		binding.show();
        
	}

}
