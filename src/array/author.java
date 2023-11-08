package array;

class author 
{
	String name;
	int age;
	String location;
	author()
	{
	}
	author(String name,int age,String location)
	{
		this.name=name;
		this.age=age;
		this.location=location;
	}

	public void detailsOfAuthor() 
	{
		System.out.println("**Details of author**");
		System.out.println("name :" +name);
		System.out.println("age :" +age);
		System.out.println("location :" +location);
	}
}
class book 
{
	String bname;
	int price;
	String author;
	author a=new author("chetan bhagat",48,"mumbai");
	book()
	{
	}
	book(String bname,int price,String author)
	{
		this.bname=bname;
		this.price=price;
		this.author=author;
	}
	public void detailsOfBook() 
	{
		System.out.println("**Details Of Book**");
		System.out.println("bname :" +bname);
		System.out.println("price :" +price);
		System.out.println("author :" +author);
		a.detailsOfAuthor();
	}
}

