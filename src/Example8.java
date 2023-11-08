
public class Example8 {
    String ename;
    String eid;
    int marks;
    long cno;
    Example8()
    {
    	System.out.println("object is created with default");
    }
    Example8(String ename,String eid,int marks,long cno)
    {
    	this.ename=ename;
    	this.eid=eid;
    	this.marks=marks;
    	this.cno=cno;
    }
       public Example8 detailsofexample()
      {
    	 System.out.println("ename: "+ename);
    	 System.out.println("eid: "+eid);
    	 System.out.println("marks: "+marks);
    	 System.out.println("cno: "+cno);
    	 return this;
      }
    public static void main(String[]args)
    {
    	Example8 e=new Example8();
    	
    	Example8 e1=new Example8("as","rt",67,900l);
    	System.out.println(e1.detailsofexample());
    	Example8 e2=new Example8("asj","12",45,9123l);
    	System.out.println(e2.detailsofexample());
    }
    
}
