
 class First {

	 void show()
	{
		System.out.println("from a");
	}
 }
	class Second extends First
	{
		void show()
		{
			System.out.println("from b");
		}
	}
	class Driver2
		{
			public static void main(String[] args)
			{
				Second s=new Second();
				s.show();
			}
		}
