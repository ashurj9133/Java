package array;

public class A4 {
    public static void main(String[] args)
    {
    	A4.sub(new int[]{50,20});
    }
    static void sub(int[] a)
    {
    	int total=0;
    	
    	for(int i:a)
    	{
    		total=total+i;
    	}
    	System.out.println("sub is "+ total);
    }
}
