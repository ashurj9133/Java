
public class Example3 {
	public static void main(String[]args)
	{
		//StringBuffer sb="java";
		StringBuffer s1=new StringBuffer("java");
		s1.capacity();
		System.out.println(s1);
		System.out.println(s1.capacity());
		s1.length();
		System.out.println(s1);
		System.out.println(s1.length());
		StringBuffer s2=new StringBuffer("python");
		System.out.println(s2.charAt(3));
		s2.append(" manuel");
		System.out.println(s2);
		s2.insert(1,"ashu");
		System.out.println(s2);
		s2.delete(4,6);
		System.out.println(s2);
		StringBuffer s3=new StringBuffer("ashutosh");
		s3.deleteCharAt(4);
		System.out.println(s3);
		StringBuffer s4=new StringBuffer("lalan");
		System.out.println(s4.reverse());
		s4.setLength(3);
		System.out.println(s4);
		StringBuffer s5=new StringBuffer("jaggu");
		s5.substring(1,4);
		System.out.println(s5);
		s5.replace(1, 2, "t");
		System.out.println(s5);
		s1.trimToSize();
		System.out.println(s1);
		s5.setCharAt(3, 'a');
		System.out.println(s5);
		s5.ensureCapacity(0);
		System.out.println(s5);
		
			
	}

}
