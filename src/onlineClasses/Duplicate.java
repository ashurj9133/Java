package onlineClasses;

public class Duplicate {
	void show() {
	long first=9123183585l;
	long second=91231833385l;
	int noofdigits=10;
		if(String.valueOf(first).length()==noofdigits&&String.valueOf(second).length()==noofdigits) {
	if(first==second)
	{
    System.out.println("it is duplicate mobile no");
	}
	else {
		System.out.println("it is not a duplicate mobile no");
	}
	}
	else {
		System.out.println("invalid no");
	}
	}
	public static void main(String[] args) {
		
		Duplicate duplicate=new Duplicate();
		duplicate.show();
	}

}
