package multithreading;

public class FiveToFive extends Thread {

	public void run()
	{
		for(int i=1;i<=5;i++)
		{	
			//System.out.println(i);
		System.out.println("5*"+i+"="+(5*i));
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}
}
