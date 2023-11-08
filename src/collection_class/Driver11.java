package collection_class;
   interface A{
	void m1();
       }
     interface B extends A{
	void m2();
     }
     interface C extends B{
    	 void m3();
     }
 class Downcasting implements A,B,C {
   public   void m1()
     {
    	 System.out.println("h 1");
     }
   public   void m2() {
    	 System.out.println("h 2"); 
     }
  public   void m3()
     {
    	 System.out.println("h 3");
     }
  void m4()
  {
	  System.out.println("ashu");
  }
 }
  class Driver11{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//          Downcasting d=new Downcasting();
//          d.m1();
//          d.m2();
//          d.m3();
//          d.m4();
          C a=new Downcasting();
          C d=(C)a;
          d.m1();
          d.m2();
          d.m3();
         // d.m4();
         
	}

}
