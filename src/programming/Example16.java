package programming;
   import java.io.FileInputStream;
public class Example16 {
		public static void main(String[]args) {
		try
		{
			
			FileInputStream fis=new FileInputStream("d:/Movies");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		System.out.println("file is not found");
		}
	
}
