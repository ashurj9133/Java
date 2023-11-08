package part1;
import part1.Student;
public class Driver4 {
	public static void main(String []args)
	{
		Student s=new Student("ram",123,34,45,"A");
		System.out.println(s.toString());
		Student s1=new Student("harami",12,23,48,"B");
		System.out.println(s1);
		System.out.println(s.equals(s1));
	}
}
