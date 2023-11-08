
public class Duster {
   String brand;
   String color;
   double size;
   int price;
   Duster()
   {
	   System.out.println("i m first constructor");
   }
   Duster(double size,int price)
   {
	   this(price);
	   this.size=size;
	   System.out.println(" i m second constructor");
   }
   Duster(int price)
   {
	   this();
	   this.price=price;
	   System.out.println(" i m third constructor");
   }
   Duster(String brand,String color,double size,int price)
   {
	   this(size,price);
	   this.brand=brand;
	   this.color=color;
	   System.out.println(" i m fourth constructor");
   }
    void detailsofduster()
   {
	   System.out.println("brand: "+brand);
	   System.out.println("color: "+color);
	   System.out.println("size: "+size);
	   System.out.println("price: "+price);
   }
    public static void main(String[]args)
    {
    	Duster d=new Duster("classmates","black",5.8,50);
    	d.detailsofduster();
    }
}
