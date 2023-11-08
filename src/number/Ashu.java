package number;

public class Ashu {
		
		public static void main(String[] args) {
			int no=6;
			int sum=0;
			for(int i=1;i<no;i++)
			{
				if(no%i==0)
				{
					sum=sum+i;
				}
			}
			if(sum==no)
			{
				System.out.println("perfect no: "+no);
			}
			else
			{
				System.out.println("not a perfect no: "+no);
			}
		}
}