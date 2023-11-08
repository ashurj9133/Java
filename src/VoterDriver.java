import java.util.Scanner;


public class VoterDriver {
	public static void main(String []args) {
		Scanner s=new Scanner(System.in);
		VoterPortal v=new VoterPortal();
		System.out.println("welcome to voter portal");
		//System.out.println("Enter your name");
		//String name=s.next();
		System.out.println("Enter your age");
		int age=s.nextInt();
		try {
			v.isAgeValid(age);
			System.out.println("voting successful");
		}
		catch(Exception a) {
			System.err.println(a);
		}
	}

}
