package part2;
import java.util.Objects;
public class Marker implements Comparable{
	String color;
	int price;
	public Marker(String color,int price)
	{
		this.color=color;
		this.price=price;
	}
	public String toString()
	{
		return color+" "+price;
	}
	public boolean equals(Object o)
	{
		Marker m=(Marker)o;
		return this.color.equals(m.color)&&this.price==m.price;
	}
	public int hashCode()
	{
		return Objects.hash(color,price);
	}
	public int compareTo(Object o)
	{
		Marker m=(Marker)o;
		/*if (this.price==price)
			return 0;
		else if(this.price>price)
			return 12;
		else
			return -1;*/
		return this.color.compareTo(m.color);
	}
}
