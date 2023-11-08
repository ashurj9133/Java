package part1;
import part1.Moviess;
public class Movies {
 public static void main(String []args)
 {
	 Moviess m[]={new Moviess("rockstar",2.18,5),
			 new Moviess("pk",1.30,4),
			 new Moviess("idiot",1.45,4)};
	 System.out.println(m);
	 for (int i=0;i<m.length;i++)
	 {
		 System.out.println(m[i].toString());
		 System.out.println(m.equals(m));
			System.out.println(m.hashCode()==m.hashCode());
			System.out.println(m.hashCode());
	 }
 }
}
