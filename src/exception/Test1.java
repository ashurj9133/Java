package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

class ReadAndWrite{
	 void ReadFile()throws FileNotFoundException
	 {
		 FileInputStream fis=new FileInputStream("d:/abc.txt");
	 }
	 void SaveFile()throws FileNotFoundException
	 {
		 FileOutputStream fos=new FileOutputStream("d:xyz.txt");
	 }
 }
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ReadAndWrite rw=new ReadAndWrite();
        try {
        rw.ReadFile();
        }
        catch(FileNotFoundException e)
        {
        	e.printStackTrace();
        }
        System.out.println("hai");
        try {
        	rw.SaveFile();
        }
        catch(FileNotFoundException e)
        {
        	e.printStackTrace();
        }
        System.out.println("hellow");
	}

}
