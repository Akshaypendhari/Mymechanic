package myMechanic;
import java.util.*;
public class SelectCar  {
	
	
	public void cars()
	{
		
		
		
		Scanner sc=new Scanner(System.in);
	System.out.println("choose your vehicle from list");
	
	System.out.println("Select Brand");
	
	System.out.println(" 1 for Honda");
	System.out.println(" 2 for Maruti Suzuki");
	System.out.println(" 3 for Hyundai");
	System.out.println(" 4 for TATA");
	System.out.println(" 5 for Wolkswagon");
	int a =sc.nextInt();
	
	
	switch(a) 
	{
	case 1:System.out.println("Select model of Honda ");
	System.out.println("1 for Honda City");
	System.out.println("2 for Honda Amaze");
	System.out.println("3 for Honda Civic");
	System.out.println("0 back ");
	 int b = sc.nextInt();
	 
	 
	 switch(b) 
	 {
	 case 1:System.out.println("you select Honda City");
	 

	 break;
	 
	 case 2:System.out.println("you select Honda Amaze");
	 
	 break;
	 
	 case 3:System.out.println("you select Honda Civic");
	
	 break;
	 
	 case 0:
		 cars();
	 break;
		 
	 default:System.out.println("please choose right option");
	 break;
	 
	 }
	 
	break;
	
	case 2:System.out.println("Select model of Maruti Suzuki");
	System.out.println("1 for Maruti Suzuki 800");
	System.out.println("2 for Maruti Suzuki alto");
	System.out.println("3 for Maruti Suzuki swift ");
	System.out.println("0 back ");
	
	int c = sc.nextInt();
	 
	 switch(c) 
	 {
	 case 1:System.out.println("you select Maruti Suzuki 800");
	 

	 break;
	 
	 case 2:System.out.println("you select Maruti Suzuki alto");
	 
	 
	 case 3:System.out.println("you select Maruti Suzuki swift");
	 
	 break;
	 
	 case 0:
		 cars();
	 break;
	 
	 default:System.out.println("please choose right option");
	 break;
	 
	 }
	break;
	
	
	
	case 3:System.out.println("Select model of Hyundai");
	System.out.println("1 for Hyundai Creta");
	System.out.println("2 for Hyundai i10");
	System.out.println("3 for Hyundai i20 ");
	System.out.println("0 back ");
	int d = sc.nextInt();
	 switch(d) 
	 {
	 case 1:System.out.println("you select Hyundai Creta");

	 break;
	 
	 case 2:System.out.println("you select Hyundai i10");
	 break;
	 
	 case 3:System.out.println("you select Hyundai i20 ");
	 break;
	 
	 case 0:
		 cars();
	 break;
	 
	 
	 default:System.out.println("please choose right option");
	 break;
	 
	 }
	break; 
	
	
	case 4:System.out.println("Select model  of TATA");
	System.out.println("1 for TATA nexon");
	System.out.println("2 for TATA indica");
	System.out.println("3 for TATA tigor ");
	System.out.println("0 back ");
	
	int e = sc.nextInt();
	 switch(e) 
	 {
	 case 1:System.out.println("you select TATA nexon");

	 break;
	 
	 case 2:System.out.println("you Hyundai TATA indica");
	 break;
	 
	 case 3:System.out.println("you select  TATA tigor");
	 break;
	 
	 case 0:
		 cars();
	 break;
	 
	 default:System.out.println("please choose right option");
	 break;
	 
	 }
	
	break;
	
	case 5:System.out.println("Select model of Wolkswagon");
	
	System.out.println("1 for Wolkswagon polo");
	System.out.println("2 for Wolkswagon pasat");
	System.out.println("3 for Wolkswagon vento ");
	System.out.println("0 back ");
	
	int f = sc.nextInt();
	 switch(f) 
	 {
	 case 1:System.out.println("you select Wolkswagon polo");

	 break;
	 
	 case 2:System.out.println("youHyundai Wolkswagon pasat");
	 break;
	 
	 case 3:System.out.println("you select Wolkswagon vento");
	 break;
	 
	 case 0:
		 cars();
	 break;
	 
	 default:System.out.println("please choose right option");
	 break;
	 
	 }
	break;
	
	case 0: System.out.println("choose proper option");
	cars();
	break;
	}
	
		
	}// TODO Auto-generated method stub

	
	
}




