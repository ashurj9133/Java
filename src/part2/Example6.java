package part2;

public class Example6 {
public static void m1(int a,int b)
{
	if (a>b) {
		System.out.println("passed");
	}
	else
		throw new ArithmeticException("b is greater than a");
}
public static void main(String[]args)
{
	System.out.println("Execution starts");
	try {
		m1(15,27);
	}
	catch(ArithmeticException e) {
		System.err.println("Exception handled");
	}
	System.out.println("Exception ends");
	}

}
