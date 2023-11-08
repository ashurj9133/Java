package programming;
class Bank{
   private String username;
   private int pin;
   private double balance;
   private String bank_name;
   private int cno;
   
   Bank(String username,int pin,String bank_name,long cno){
	   username=username;
	   pin=pin;
	   bank_name=bank_name;
	   cno=cno;
   }
   public void setCno(int pin,int cno)
   {
	   //username=rname;
	 if(pin==pin)
	 {
		 cno=cno;
	   //bank_name=bname;
	   //cno=no;
		 System.out.println("contact no is updated");
	 }
		 else
		 
			 System.out.println("invalid pin");
   }
   public void setBalance(int pin,double balance)
   {
	   if(pin==pin)
	   {
		   balance=balance;
		   System.out.println(" amount is deposited");
	   }
	   else
		   System.out.println("invalid pin");
   }
   public void sendAmount(int pin,double balance)
   {
	   if(pin==pin)
	   {
		  if(balance>balance)
		  balance=balance-balance;
		  else
			  System.out.println("insufficient balance");
	   }
	   else
		   System.out.println("invalid pin");
   }
   public void receiveAmount(double amount)
   {
	   balance=balance+amount;
   }
   public String getUsername()
   {
	   return username;
   }
   public int getPin(int cno)
   {
	   if(cno==cno)
	   {
		   return pin;
	   }
	   else
		   return 0;
	   
	   
   }
   public double getBalance(int pin)
   {
	   if(pin==pin)
	   {
		   return balance;
	   }
	   else
		   return 0;
   }
   
   
}
public class Example15 {
  public static void main(String[]args)
  {
	  Bank b=new Bank(null, 0, null, 0);
	  b.setBalance(1234,2500);
	  System.out.println(b.getBalance(1234));
	  //System.out.println(b.getPin());
	  b.setCno(1234, 123456);
	  b.sendAmount(1234, 5000);
	  System.out.println(b.getBalance(1234));
	  b.receiveAmount(4000);
	  System.out.println(b.getBalance(1234));
  }
}
