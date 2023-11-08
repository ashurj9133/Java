package programming;

 class Duster {
	String color;
	int size;
	double price;
	String brand;
	Duster(){
		System.out.println("i am default constructor");
	}
	Duster(String color,int size,double price){
		this(color,size);
		this.price=price;
		System.out.println("i am second constructor");
		}
	Duster(String color,int size){
	     this.color=color;
	     this.size=size;
	     System.out.println("i am third constructor");
	}
	Duster(String color,int size,double price,String brand){
		this(color,size,price);
		this.brand=brand;
	}

  public  void detailsofduster()
  {
	  System.out.println("color: "+color);
	  System.out.println("size: "+size);
	  System.out.println("price: "+price);
	  System.out.println("brand: "+brand);
	  
  }
}
class Example14{
 public static void main(String[] args) {
	 Duster d=new Duster();
	        d.detailsofduster();
	 }
 }
