package gomechanic;
import java.util.*;



class Login
{
	private String  fname;
	private long phonenumber;
	private String username;
	private String password;
	String vehicle;
	
	public String getFname() {
		return fname;
	}


	public void setFname(String fname) {
		this.fname = fname;
	}


	public long getPhonenumber() {
		return phonenumber;
	}




	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}




	public String getUsername() {
		return username;
	}




	public void setUsername(String username) {
		this.username = username;
	}




	public String getPassword() {
		return password;
	}




	public void setPassword(String password) {
		this.password = password;
	}

	public void checking(String un,String pass) {
		
		if(getUsername().equals(un)&& getPassword().equals(pass) ) 
		{
			System.out.println("Welcome  " + getFname());
		}
		else 
		{
			System.out.println("Wrong Username/Password");
			enter();
		}
	}
	
	public void enter() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Username");
		String un = sc.nextLine();
		System.out.println("Enter Password");
		String pass = sc.nextLine();
		
		checking(un,pass);
			
			
			
		}
	}


	class ATMDeatils
	{    Services ref3= new Services();
	
		private long atmNumber=123456789;
		private int cvv=007;
		private int password=123456;
		
		
		
		
		public long getAtmNumber() {
			return atmNumber;
		}
		public void setAtmNumber(long atmNumber) {
			this.atmNumber = atmNumber;
		}
		public int getCvv() {
			return cvv;
		}
		public void setCvv(int cvv) {
			this.cvv = cvv;
		}
		public int getPassword() {
			return password;
		}
		public void setPassword(int password) {
			this.password = password;
		
		}
		
		public void verification (long num, int cvv,int pass ) 
		{
			
			if (getAtmNumber()== num && getCvv()==cvv && getPassword()==pass) 
			{
				System.out.println(" ****Payment Done**** "
						+ "\n\n THANK YOU  ");
			}
			else 
			{
				System.out.println("Please provide proper ATM number/CVV/Atm pin");
				ref3.paymentOptions() ;
			}
		}
		
	}
	
	





public class Mainpage {
	
	static 
	{
		System.out.println("Welcome to MYmechanic");
		System.out.println("Create an Account");
		
	}
	
	
	
	public void accountCreation() 
	{ Scanner sc = new Scanner (System.in);
		Login l1 = new Login();
		System.out.println("Enter your Name");
		String fname=sc.nextLine();
		
		System.out.println("Enter Username");
		String username=sc.nextLine();
		
		System.out.println("Enter password");
		String password=sc.nextLine();
		
		System.out.println("Enter your Phone Number");
		long phonenumber = sc.nextLong();
		sc.nextLine();
		
		int count =0;
		while (phonenumber!=0) 
		{
			long d= phonenumber%10;
			count++;
			phonenumber=phonenumber/10;	
			
		}
		if (count ==10) {
			l1.setPhonenumber(phonenumber);
			l1.setFname(fname);
			l1.setPassword(password);
			l1.setUsername(username);
			System.out.println("Account Created Successfully");
			System.out.println("==========================================================================================================================================");
			
			// log in process 
			
			System.out.println("Please logIn With proper Details");
			
			
			 l1.enter();
		}
		else {System.out.println("Enter  valid mobile number");
		accountCreation() ;
		
		}
		
		
		
	
	}
	
	
	
	public static void main(String[] args)
	{	Mainpage m= new Mainpage();
		
		Scanner sc = new Scanner(System.in);
		// signup  process
		
		m.accountCreation() ;
		
		
		
		SelectCar car=new SelectCar();
		car.cars();
		
	
		Services services =new Services();
		services.scheduledService();
		
	}

}
