package number;

class Test{
	

	public static void main(String[] args) {
		 
//    char[] a= {'A','S','H','U','T','O','S','H'};
//       int length=a.length;
//       for(int i=length;i>0;i--)
//       {
//    	   for(int j=0;j<i;j++)
//    	   {
//    		   System.out.print(a[j]);
//    	   }
//    	   System.out.println();
//       }
		
		        printPattern();
		    }

		    public static void printPattern() {
		        String[] lines = {
		            "AAAAAAAA",
		            "SSSSSSS",
		            "HHHHHH",
		            "UUUUU",
		            "TTTT",
		            "OOO",
		            "SS",
		            "H"
		        };

		        for (String line : lines) {
		            System.out.println(line);
		        }
		    }
		}


