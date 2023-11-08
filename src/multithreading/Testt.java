package multithreading;
 class Test extends Thread{
	 public void run()
	 {
		 System.out.println("i am m1");
	 }
 }
 class Demo extends Thread{
	 public void run() {
		 System.out.println("i am m2");
	 }
 }
public class Testt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Test t=new Test();
        t.start();
        Demo d=new Demo();
        d.start();
	}

}
