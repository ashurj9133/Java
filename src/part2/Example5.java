package part2;

public class Example5 {
	public static void main(String[] args)
	{
System.out.println("Main starts");
try {
	Example5 ref=(Example5)new Object();
}
catch(ClassCastException e) {
	int a=12;
	int b=0;
	int c=0;
	try {
		c=a/b;
	}
	catch(ArithmeticException d) {
		System.out.println("Exception handled");
	}
	System.out.println(c);	
}
System.out.println("main ends");
}
}