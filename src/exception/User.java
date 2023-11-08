package exception;


class User{
  public static void main(String[]args) {
  Employee g=new Employee("ashu101",1000,"ashutosh");
  System.out.println("Employee ID: " + g.getId());
  System.out.println("Employee Name: " + g.getName());
  System.out.println("Employee Salary: " + g.getSalary());
//Modifying data members using setters
  g.setId("ashu202");
  g.setName("Jane Smith");
  g.setSalary(60000);

  // Accessing data members after modification
  System.out.println("\nUpdated Employee ID: " + g.getId());
  System.out.println("Updated Employee Name: " + g.getName());
  System.out.println("Updated Employee Salary: " + g.getSalary());
  }
}

