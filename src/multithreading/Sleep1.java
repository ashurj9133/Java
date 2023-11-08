package multithreading;

import java.util.Hashtable;

public class Sleep1 {
	public static void main(String[]args)
	{
		Hashtable hs=new Hashtable();
		hs.put(1,"ashu");
		hs.put(13,"ramgarh");
		hs.put(4,"Mohania");
		hs.put(4,"Mohania");
		System.out.println(hs);
		System.out.println(hs.put(1,"bhabua"));
		hs.remove(4);
		System.out.println(hs);
		//hs.get(3);
		System.out.println(hs.get(4));
		
		//hs.putAll(hs);
		//System.out.println(hs);
		System.out.println(hs.toString());
		Hashtable hs1=new Hashtable();
		hs1.put(22,"tosh");
		hs1.put(23, "as");
		hs1.put(24,"god");
		hs1.put(25,"smith");
		hs1.putAll(hs);
		System.out.println(hs1);
		//System.out.println(hs1.toString());
		System.out.println(hs1.remove(23));
		System.out.println(hs1.containsKey(23));
		System.out.println(hs1.containsValue("god"));
		System.out.println(hs1.keySet());
		System.out.println(hs1.values());
		System.out.println(hs1.entrySet());
		
		
		
		
	}

}
