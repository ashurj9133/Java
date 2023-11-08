package collection_class;
class Test{
	Test(Demo t) {
		System.out.println("i am m1 method");
		
          }
         }      
public class Demo {
	void m2()
    {
  	  Test t=new Test(this);
  	  System.out.println("i am ramgarh");
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//     Test t=new Test();
//     t.m1();
		Demo d=new Demo();
		d.m2();
	}

}
