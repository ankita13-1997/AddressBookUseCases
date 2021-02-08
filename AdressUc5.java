import java.util.ArrayList;
import java.util.Scanner;

public class AdressUc5 {
	static Scanner sc= new Scanner(System.in);
	static ArrayList<Book> store = new ArrayList<Book>();
	int length = store.size();
	      //static Book st2;
	  
			
			static boolean exit=false;
static void add_new()
{    
	
	System.out.println("enter the number of person you wnna to add");
	  int n=sc.nextInt();
			    
	  for(int i=0 ;i<n; i++) 
      {
		 Book b1=new Book(); 
		System.out.println("enter id");
		b1.setId(sc.nextInt());
		System.out.println("enter the first_name");
		b1.setFsname(sc.next());
		System.out.println("enter the last name");
		b1.setLname(sc.next());
		System.out.println("enter the city");
		b1.setCity(sc.next());
		System.out.println("enter the state");
		b1.setState(sc.next());
		System.out.println("enter the zip_code");
		b1.setZip_code(sc.next());
		System.out.println("enter the phone_no");
		b1.setPhone_no(sc.next());
		System.out.println("enter the email_id");
		b1.setEmail(sc.next());
		System.out.println("adding the records " +b1.toString());
	
		store.add(i,b1);
		//b1=null;
		System.out.println(store.toString());
		
		// st2= store.get(i);
			  }
	  //System.out.println(st2);
		
	}

static void print()
{
	
	System.out.println(store.toString());
	
	
}
	public static void main(String[] args) {
		
		while(!exit)
		{
			Scanner sc= new Scanner(System.in);
			System.out.println("1. for adding contact");
			System.out.println("2.displaying");
			System.out.println("3.updating the addrss book");
			System.out.println("4.for data removal");
			System.out.println("5.For Exit");
			System.out.println("choose your option");
			int userin=sc.nextInt();
			switch(userin) {
			case 1:
				add_new();
				break;
				
				
			case 2:
				
				print();
				break;
				
			case 3:
				//update();
				break;
					
					
					
			case 4:
				//delete();
				break;
				
			case 5:
			//	end();
				break;
				
			}
				
		}		
		// TODO Auto-generated method stub

	}

}
