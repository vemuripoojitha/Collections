import java.util.Scanner;
public class ListMain {
		public static void main(String args[]) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		ListObject<Object> l=new ListObject<Object>();
		while(true)
		{
			System.out.println("Select the options");
			System.out.println("1.add ");
			System.out.println("2.Delete");
			System.out.println("3.fetch data");
			System.out.println("4.print the whole list");
			System.out.println("5.break");
			
			int s=sc.nextInt();
			if(s==1)
			{
				int n=sc.nextInt();
					l.add(n);
				
			}
			else if(s==2)
			{
				System.out.println("Enter the position to delete");
				int g=sc.nextInt();
				l.remove(g);
				
			}
			else if (s==3)
			{
				System.out.println("Enter the position to fetch the data");
				int g1=sc.nextInt();
				Object y1=l.get(g1);
				System.out.println(y1);
				
				
			}
			else if(s==4)
			{
				l.display();
			}
			else
			{
				break;
			}
			
			
		}
	}
}
