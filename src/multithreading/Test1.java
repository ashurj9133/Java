package multithreading;
 
public class Test1 extends Thread {
	public void run()
	{
		System.out.println("thread: "+Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 t=new Test1();
		t.start();
     System.out.println(Thread.currentThread().getName());
     Thread.currentThread().setName("1000");
     System.out.println(Thread.currentThread().getName());
	}

}
