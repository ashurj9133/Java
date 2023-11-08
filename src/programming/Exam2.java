package programming;

public class Exam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s="ashutosh";
        s.concat("zja");
        System.out.println(s);
        s=s.concat("zha");
        System.out.println(s.concat("abc"));
        System.out.println(s);
        s=s.toUpperCase();
        System.out.println(s);
        s=s.toLowerCase();
        System.out.println(s);
        String s1=" new ";
        s1=s1.trim();
        System.out.println(s1);
        System.out.println(s1.equals(s));
        System.out.println(s1==s);
        System.out.println(s1.contains("gg"));
        System.out.println(s1.toCharArray());
        
	}

}
