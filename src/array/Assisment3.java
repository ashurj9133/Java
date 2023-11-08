package array;

public class Assisment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= {10,23,45,46,78,87,67,98,87,34,125,7,9,};
		int temp;
        for(int i=0;i<a.length;i++)
        {
        int flag=0;
        	for(int j=0;j<a.length-1-i;j++)
        	{
        		if(a[j]>a[j+1])
        		{
        			temp=a[j];
        			a[j]=a[j+1];
        			a[j+1]=temp;
        			flag=1;
        		}
        	}
        	if(flag==0)
        	{
        		
        		break;
        	}
        }
        	for(int i=0;i<a.length;i++)
        	{
        		System.out.println(a[i]);
        	}
        
	}

}
