package array;

import java.util.Arrays;

public class Assisment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int [] a= {10,20,25,30,45};
     int n=a.length;
     int [] b=new int[n+1];
     int value=700;
     for(int i=0;i<n;i++)
     {
    	 b[i]=a[i];
    	 //System.out.println(a[i]+" ");
     }
     b[n]=value;
     System.out.println(Arrays.toString(b));
	}

}
