package array;

public class Assisment8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int[] a= {12,23,34,454,45,33,55,65};
     int search=85;
     int flag=0;
     for(int i=0;i<a.length;i++)
     {
    	if(a[i]==search)
    	{ 
    		
    		System.out.println("element is present");
    		
    		break;
    	}
    	else
    	{
    		System.out.println("element is not found");
    		break;
    	}
     }
     }
	}

