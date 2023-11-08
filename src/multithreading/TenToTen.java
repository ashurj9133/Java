package multithreading;

public class TenToTen extends Thread {

	public void run()
	{
		for(int i=1;i<=5;i++)
		{	
			System.out.println("10*"+i+"="+(10*i));
		//System.out.println(i);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}
}
