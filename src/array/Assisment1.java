package array;

import java.util.Scanner;

public class Assisment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		       Scanner s=new Scanner(System.in);
		       System.out.println("Enter the size"); 
		       int[] a=new int[s.nextInt()];
		       System.out.println("enter the element into the array");
		       for(int i=0;i<a.length;i++)
		       {
		           a[i]=s.nextInt();
		       }
		           System.out.println("enter the search");
		           int key=s.nextInt();
		           String res="not present";
		           for(int x=0;x<a.length;x++)
		           {
		           if(a[x]==key)
		           {
		               res="present";
		               break;
		           }
		       }
		           System.out.println(res);
		       
		       
		   }
		}
	
