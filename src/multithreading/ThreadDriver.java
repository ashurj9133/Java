package multithreading;

public class ThreadDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    FiveToFive f=new FiveToFive();
    f.start();
    TenToTen t=new TenToTen();
    	t.start();
	}

}
