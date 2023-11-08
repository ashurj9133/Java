package programming;

public class Exam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       StringBuffer sb=new StringBuffer("ashutosh");
       System.out.println(sb.append("java"));
       System.out.println(sb);
       System.out.println(sb.capacity());
       System.out.println(sb.length());
       StringBuffer sb1=new StringBuffer("deepak");
       StringBuffer sb2=new StringBuffer();
       System.out.println(sb1.charAt(3));
       System.out.println(sb2.length());
       System.out.println(sb1.length());
       System.out.println(sb1.delete(2,4));
       StringBuffer sb3=new StringBuffer("python");
       System.out.println(sb3.deleteCharAt(4));
       StringBuffer sb5=new StringBuffer("siyarua");
       System.out.println("sb5 :"+ sb5.substring(3,5));
       StringBuffer sb12=new StringBuffer("mohania");
       System.out.println("sb12: "+ sb12.insert(3,"zlt"));
       System.out.println();
       StringBuffer sb4=new StringBuffer();
       sb4.ensureCapacity(200);
       System.out.println("sb4:"+ sb4.capacity());
       sb4.append("hero");
       sb4.trimToSize();
       System.out.println("sb6:"+ sb4.capacity());
       sb5.setCharAt(3,'c');
       System.out.println("sb7:"+ sb5);
       StringBuffer sb7=new StringBuffer("sasaram");
       System.out.println(sb7.replace(3,5,"z"));
       
       
       
	}
}
