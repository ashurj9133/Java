
class Author 
{
	String name;
	int age;
	String location;
	Author()
	{
	}
	Author(String name,int age,String location)
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
class Book 
{
	String bname;
	int price;
	String author_name;
	Author a;
	Book()
	{
	}
	Book(String bname,int price,String author_name,Author a)
	{
		this.bname=bname;
		this.price=price;
		this.author_name=author_name;
		this.a=a;
	}
	public void detailsOfBook() 
	{
		System.out.println("**Details Of Book**");
		System.out.println("bname :" +bname);
		System.out.println("price :" +price);
		System.out.println("author :" +author_name);
		a.detailsOfAuthor();
	}
}
