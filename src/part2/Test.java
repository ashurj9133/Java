package part2;

 interface D1 {
public void m1();
public static void m2()
{
	System.out.println("from d1");
	}
}
 interface D2
 {
	 public static void m2()
	 {
		 System.out.println("from d2");
	 }
 }
 interface Demo extends D1,D2
 {}
 class Test implements Demo
 {
	 //m1();
	 public void m1()
	 {
		 System.out.println("Implemented");
	 }
	 public static void main(String[]args)
	 {
		 D1 ref=new Test();
		 ref.m1();
		 D1.m2();
	 }
 }
