package multithreading;

public class OddNumber implements Runnable {
    public void run()
    {
    	for(int i=0;i<=10;i++)
    	{
    		if(i%2!=0)
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
    }
    public static void main(String[]args)
    {
    	OddNumber o=new OddNumber();
    	Thread t=new Thread(o);
    	t.start();
    	Thread t1=new Thread(o);
    	t1.start();
    	Thread t2=new Thread(o,"ashu");
    	t2.start();
    	System.out.println(t2.getName());
    	
    }
}
