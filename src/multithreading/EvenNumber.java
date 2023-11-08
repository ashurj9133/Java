package multithreading;

public class EvenNumber extends Thread {
   public void run()
   {
	   for(int i=0;i<=20;i++)
	   {
		   if(i%2==0)
		   {
		   System.out.println(i);
		   }
	   try {
		Thread.sleep(2000);
	} 
	   catch (Exception e) {
	
		e.printStackTrace();
	}
	   }
   }
   
   public static void main(String[]args)
   {
	   EvenNumber e=new EvenNumber();
	   e.start();
	   EvenNumber e1=new EvenNumber();
	   e1.start();
   }
}
