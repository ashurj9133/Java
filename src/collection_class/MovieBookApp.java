package collection_class;

class BookTheaterSeat{
	static int total_seats=10;
	 static synchronized void bookSeat(int seats){
	 if(total_seats>=seats)
	 {
	     System.out.println(seats+"seat is booked");
	     total_seats=total_seats-seats;
	     System.out.println("left seat: "+ total_seats);
	 }
	 
	 else
	 {
	     System.out.println("seat is not booked");
	     System.out.println("seats left: "+total_seats);
	 }
	 }
	}

	public class MovieBookApp extends Thread{
	    static BookTheaterSeat b;
	            int seats;
	         public void run()
	            {
	              b.bookSeat(seats); 
	            }
	   public static void main(String[]args){
	       b=new BookTheaterSeat();
	       MovieBookApp ashu=new MovieBookApp();
	       ashu.seats=3;
	       ashu.start();
	       MovieBookApp t2=new MovieBookApp();
	       t2.seats=6;
	       t2.start();
	       MovieBookApp t3=new MovieBookApp();
	       t3.seats=6;
	       t3.start();
	       MovieBookApp t4=new MovieBookApp();
	       t4.seats=6;
	       t4.start();
	   } 
	}

