
public class Example7 {
  String name;
  int roll_no;
  static String emp_id="ashu12";
  Example7()
  {
	  System.out.println("im constructor");
  }
  
  Example7(String name,int roll_no)
  {
	  this.name=name;
	  this.roll_no=roll_no;
  }
  void display()
  {
	  System.out.println(name+" "+roll_no+" "+emp_id);
  }
  public static void main(String[]args)
  {
	  Example7 e=new Example7();
	  Example7 e7=new Example7("ram",50);
	  e7.display();
	  
	  System.out.println(Example7.emp_id);
  }
  
}
