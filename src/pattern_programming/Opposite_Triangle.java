package pattern_programming;

public class Opposite_Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a=4;
    for(int i=1;i<=a;i++)
    {
    	for(int j=4;j>=i;j--)
    	{
    		System.out.print("*");
    	}
    	System.out.println();
    }
	}

}
