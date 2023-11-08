package multithreading;

public class NaturalNumber implements Runnable {
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println(i+" ");
		
		try {
			Thread.sleep(2000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		}
	}
	public static void main(String[]args)
    {
    	NaturalNumber n=new NaturalNumber();
    	Thread t=new Thread(n);
    	t.start();
    	Thread t1=new Thread(n);
    	t1.start();
    	Thread t2=new Thread(n,"ashu");
    	t2.start();
    	System.out.println(t2.getName());
    }
}
