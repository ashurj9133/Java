package exception;

public class Employee {
    String emp_id;
	int salary;
	String name;
    Employee()
      {};
   Employee(String emp_id,int salary,String name)
   {
   this.emp_id=emp_id;
   this.salary=salary;
    this.name=name;
    }
//getters
   public String getName()
   {
    return name;
    }
   public int getSalary()
   {
    return salary;
    }
    public String getId()
    {
     return emp_id;
     }
//setters
     public void setSalary(int salary)
     {
    this.salary=salary;
     }
    public void setId(String emp_id)
    {
    this.emp_id=emp_id;
     }
    public void setName(String name)
    {
    this.name=name;
     }
      }