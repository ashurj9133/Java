package part1;

public class Student{
	
	String name;
	int id;
	int age;
	int marks;
	String blood_group;
	public Student(String name, int id, int age, int marks, String blood_group) {

		this.name = name;
		this.id = id;
		this.age = age;
		this.marks = marks;
		this.blood_group = blood_group;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", age=" + age + ", marks=" + marks + ", blood_group="
				+ blood_group + "]";
	}
	@Override
	public boolean equals(Object o)
	{
		Student s=(Student)o;
		return this.name.equals(s.name)&&this.id==s.id&&this.age==s.age&&this.marks==s.marks&&this.blood_group.equals(s.blood_group);
	}
	
}
