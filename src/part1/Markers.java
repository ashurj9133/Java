package part1;
import part1.Marker;
public class Markers {
 public static void main(String []args)
 {
	 Marker m[]= {new Marker("blue"),
			 new Marker("black"),
			 new Marker("green")};
	 System.out.println(m);
	 for (int i=0;i<m.length;i++)
	 {
		 System.out.println(m[i].toString());
	 }
 }
}
