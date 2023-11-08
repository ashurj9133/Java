package programming;

class Lali{
	String child;
	Lali()
	{
	}
	Lali(String child)
	{
		this.child=child;
	}
	void display()
	{
		System.out.println("Lali hava a baby");
	}
}
	class Ramu extends Lali{
		String gf;
		Ramu(String child,String gf)
		{
		this.gf=gf;
		this.child=child;
		}	
       }
public class SingleLevel {

	public static void main(String[] args) {
		Lali l=new Lali("lulu,chulu");
		l.display();
		
		Ramu r=new Ramu("lulu","hulu");
		System.out.println(r.gf);
		System.out.println(r.child);

	}

}
