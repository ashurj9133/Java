package multithreading;

public class PrimeNumber extends Thread {
    public void run() {
	try{
		int n=11;
		int flag=0;;
		//int end=20;
		//int start=1;
		for(int i=1;i<=n;i++)
			{
			if(n%i==0) {
			flag++;
			
			}
		}
		if(flag==2)
		{
			//for(int i=start;i<=end;i++)
			//{
			Thread.sleep(2000);	
			System.out.println(n+" is prime no");
			//}
		
			
//			System.out.println(n+" is sum of prime n");
		}
//			else
//			{	
//		System.out.println(n+" is not a prime no");
//		}
	
	}
	catch (InterruptedException e) {
		e.printStackTrace();
	}
}
}

