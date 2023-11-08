package programming;

public class Array2d {
	public static void main(String[]args) {
      int[][] a= {{10,20,30},{40,50},{70,80,90}};
      /*a=new int[4][3];
      a[0][0]=10;
      a[0][1]=10;
      a[1][1]=10;*/
      
      for(int i=0;i<a.length;i++)
      {
    	  for(int j=0;j<a[i].length;j++)
    	  {
    		  System.out.println(a[i][j]);
    	  }
    	  System.out.println();
      }
      

}
}