   package part2;

   public class Example2 {
  public static void main(String[]args)
  {
   String s="java";
String s1=s.toUpperCase();
System.out.println(s1);
//concatnation
String s2="  is a programming language";
s2=s1.concat(s2);
System.out.println(s2);
//trim
String s3=s1.trim();
System.out.println(s1);
//length
System.out.println(s1.length());
//charAt(int index)
String s4="world is not enough";
System.out.println(s4.charAt(4));
//substring(int index)
String s5=s4.substring(5);
System.out.println("s5: "+s5);
//substring(start index,end index)
String s6=s4.substring(4,7);
System.out.println("s6: "+s6);
//isEmpty
String s7="ashutosh";
System.out.println(s7.isEmpty());
boolean ss=s7.contains(" ");
System.out.println(ss);
byte[]sss=getBytes();
System.out.println(sss);
//indexof(char ch)
System.out.println(s4.indexOf('a'));
System.out.println(s4.indexOf('a',3));
System.out.println(s4.lastIndexOf('a'));
System.out.println(s4.lastIndexOf("not"));
//split(String s)
String[]str=s4.split(" ");
for (int i=0;i<str.length;i++)
{
	System.out.println(str[i]+" ");
	}
}

private static byte[] getBytes() {
	// TODO Auto-generated method stub
	return null;
}
}
