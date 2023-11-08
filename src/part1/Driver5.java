package part1;
import part1.Icecream;
public class Driver5 {
   public static void main(String[]args)
   {
	   Icecream i1=new Icecream("vanila",40);
	   System.out.println(i1);
	   Icecream i3=new Icecream("Butter",50);
	   System.out.println(i3);
	   System.out.println(i1.equals(i3));
	   System.out.println(i1.hashCode()==i3.hashCode());
   }
}
