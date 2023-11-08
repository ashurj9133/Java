package part1;

abstract class Vehicle
{
	int no_of_tiyers;
	
	abstract void display();
	}
class Car extends Vehicle
{
	void display()
	{
		System.out.println("no of tiyers=4");
	}
	}
class Scooter extends Vehicle
{
	void display()
	{
		System.out.println("no of tiyers=2");
	}
	}
class Driver2{
	public static void main(String[]args)
	{
		Car c=new Car();
		c.display();
		Scooter s=new Scooter();
		s.display();
	}
}