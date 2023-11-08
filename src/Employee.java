
public class Employee {
     int empid;
     String name;
     String company;
     
	 Employee(int empid, String name, String company) {
		this.empid = empid;
		this.name = name;
		this.company = company;
	}
	void display()
	{
		System.out.println("empid: "+empid );
		System.out.println("name: "+name);
		System.out.println("company: "+company);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Employee e1=new Employee(1,"ashu","smart");
       e1.display();
	}

	
}
