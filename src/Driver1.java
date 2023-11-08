
 interface I2 {
	abstract public void m1();
	 public static void m3()
	
	 {
		 System.out.println("from i1");
	 }
	 static int a=12;
	 
}
 class C2 implements I2
{
	public void m1()
	{
		System.out.println("implementation provided");
	}
}
	class Driver1
	{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   C2 ref=new C2();
   ref.m1();
   System.out.println(C2.a);
   
   I2.m3();
	}

}
