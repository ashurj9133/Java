package part1;

import java.util.Objects;

public class Icecream {
  String flavour;
  double price;
  
  public Icecream(String flavour,double price)
  {
	  this.flavour=flavour;
	  this.price=price;
  }
  Icecream()
  {}
  @Override
public String toString() {
	return flavour="" + flavour + ", price=" + price;
}
@Override
   public boolean equals(Object obj)
   {
	  Icecream i=(Icecream)obj;
	  return this.flavour.equals(i.flavour)&&this.price==i.price;
  }
  @Override
  public int hashCode()
  {
	  return Objects.hash(flavour,price);
  } 
}
