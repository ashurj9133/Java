package number;

public class PrimeNO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int n=40;
    int count=0;
    for(int i=1;i<=n;i++)
    {
    	if(n%i==0)
    	{
    		count++;
    	}
    } 
    if(count==2)
    {
    	System.out.println("prime no");
    }
    else
    {
    	System.out.println("not a prime no");
    }
	}

}
