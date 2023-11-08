 package part1;
 import part1.Movie;
 public class MovieDriver1 {
 public static void main(String[]args)
 {
	Movie m1=new Movie("Rockstar",1.30,5);
	System.out.println(m1);
	Movie m2=new Movie("Transformer",2.30,4);
	System.out.println(m2);
	System.out.println(m1.equals(m1));
	System.out.println(m1.hashCode()==m2.hashCode());
	System.out.println(m1.hashCode());
	}
 }
