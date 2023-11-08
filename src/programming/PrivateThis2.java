package programming;
 class Pick
 {
	 private Pick(int a)
	 {
		 System.out.println("from a1");
	 }
	 public Pick()
	 {
		 this(10);
		 System.out.println("from public");
	 }
 }
public class PrivateThis2 extends Pick {
    PrivateThis2()
    {
    	System.out.println(" i am sss");
    }
    public static void main(String []args) {
    	PrivateThis2 th=new PrivateThis2();
    }
    
}
