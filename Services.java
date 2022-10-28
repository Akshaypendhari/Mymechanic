package gomechanic;
import java.util.*;
public class Services extends SelectCar{
	
	public void scheduledService() 
	{
		System.out.println(" SELECT SERVICE WHICH YOU WANT ");
		System.out.println();
		System.out.println("1 for PERIODIC SERVICE");
		System.out.println("2 for AC SERVICE");
		System.out.println("3 for BATTERY SERVICE");
		System.out.println("4 for WHEEL CARE");
		System.out.println("5 for VAS ");
		//System.out.println("6 for mechnical repair");
		System.out.println("0 for BACK ");
		Scanner ab = new Scanner(System.in);
		int a= ab.nextInt();	
		
		switch(a) 
		{
		case 1:periodic();
		break;
		
		case 2:acService() ;
		break;
		
		case 3:batteryService();
		break;
		
		case 4:wheelCare();
		break;
		
		case 5:valueAddedServices();
		break;
		
		/*case 6:
		Repairs repair =new Repairs();
		repair.maechniaclRepairs();
		break;*/
		
		
		
		case 0:cars();		
		break;
		
		default:System.out.println("CHOOSE PROPER OPTION");
		scheduledService(); 
		break;
	
		}
		
	}
	
public void periodic() 
{
	System.out.println("PERIODIC SERVICE");
	System.out.println();
	System.out.println(" 1 for BASIC SERVICE ");
	System.out.println(" 2 for STANDERD SERVICE ");
	System.out.println(" 3 for COMPREHENSIVE SERVICE \n ");
	
	System.out.println(" 0 for back");
	
	Scanner sc= new Scanner(System.in);
	int b= sc.nextInt();
	
	switch(b) 
	{
	case 1:System.out.println("******WHAT INCLUDES********");
	System.out.println("Esential Services:  Engine Oil Replacement \t Oil Filter Replacement \t Air filter cleaning \n");

	System.out.println("Performance Services:  Smartcool coolant top up \t Heater/sparkplug checking \n");

	System.out.println("Additional Service:  wiper fluid replacemnet \t Battery Water Top up \t Car Wash \t Interior Vaccuming(carpet &seat)\n");

	System.out.println("CHARGES: 3000 Rs.\n\n\n\n");
	
	System.out.println("1 to confirm your service");
	System.out.println("0 to Back");
	Scanner cd = new Scanner (System.in);
	int f = cd.nextInt();
	if  (f==0) 
	{
		periodic() ;
	}
	else if(f==1) 
	{
		finalList(3000,"Basic service" );
		
	} 
	
	

	break;
	
	case 2:System.out.println("******WHAT INCLUDES IN STANDARD SERVICE********");
	System.out.println("Esential Services:  Engine Oil Replacement \t Oil Filter Replacement \t Air filter cleaning \t Fuel Filter Checking \n");

	System.out.println("Performance Services:  Smartcool coolant top up \t Heater/sparkplug checking \t Brak fluid top up\t AC Filter Cleaning \n");

	System.out.println("Additional Service:  Car Scanning \t wiper fluid replacemnet \t Battery Water Top up \t Car Wash \t Interior Vaccuming(carpet &seat)\t Rear break Shoe Service \t Front break shoe Service\n");

	System.out.println("CHARGES: 4500 Rs.\n\n\n\n");
	
	System.out.println("1 to confirm your service");
	System.out.println("0 to Back");
	Scanner ef = new Scanner (System.in);
	int d = ef.nextInt();
	if  (d==0) 
	{
		periodic() ;
	}
	else if(d==1) 
	{
		finalList(4500,"Standerd service" );
		
	} 

	break;
	
	case 3:System.out.println("******WHAT INCLUDES IN COMPREHENSIVE SERVICE********");
	System.out.println("Esential Services:  Engine Oil Replacement \t Oil Filter Replacement \t Air filter Replacement \t Fuel Filter Replacement \n");

	System.out.println("Performance Services:  Smartcool coolant top up \t Heater/sparkplug checking \t Brak fluid top up\t  Fuel filter Checking \t AC Filter replacement \t Engine flushing \n");

	System.out.println("Additional Service:   Throttle body Cleaning \t Car Wash\t Gear oil top up \t Car Scanning \t wiper fluid replacemnet \t Battery Water Top up \t Car Wash \n Interior Vaccuming(carpet &seat)\t Rear break Shoe Service \t Front break shoe Service \t Wheel Balancing \t Wheel Alignment\t Tyre rotation");

	System.out.println("CHARGES: 7500 Rs.\n\n\n\n");
	
	System.out.println("1 to confirm your service");
	System.out.println("0 to Back");
	Scanner gh = new Scanner (System.in);
	int e = gh.nextInt();
		if  (e==0) 
		{
		periodic() ;
		}
		else if(e==1) 
		{
			finalList(7500,"Comprehensive service" );
			
		} 
	break;
	
	
	
	case 0:
	scheduledService();
	break;
	
	default:System.out.println("CHOOSE PROPER OPTION");
	periodic() ;
	break;

	}
	
}
// AC START 

public void acService() 
{
	
	System.out.println("*******AC SERVICE ********\n");
	System.out.println("1 FOR REGULAR AC SERVICE");
	System.out.println("2 FOR HIGH PERFORMANCE AC SERVICE");
	System.out.println("0 FOR BACK ");
	
	Scanner ac= new Scanner(System.in);
	int m = ac.nextInt();
	switch (m) 
	{
	case 1:
		System.out.println("REGULAR AC SERVICE\n");
	System.out.println("What Include: AC gas Filling (upto 400 gms )\t Condensor Cleaning \t AC Filter Cleaning \n");
	System.out.println("Additional Services : Ac vent cleaning \t AC Inspection\n \n ");
	System.out.println("CHARGES: 2500 Rs.\n\n\n\n");
	
	System.out.println("1 to confirm your service");
	System.out.println("0 for back");
	int o = ac.nextInt();
	if (o==0) {  acService() ; }
	else if(o==1) 
	{
		finalList(2500,"Regular AC service" );
		
	} 
	 break;
	 
	case 2:
		System.out.println("HIGH PERFORMANCE  AC SERVICE\n");
		System.out.println("What Include: AC gas Filling (upto 600 gms )\t Condensor Cleaning \t AC Filter Cleaning \n");
		System.out.println("Performance services: Compressor oil (upto 200ml )\t cooling coil cleaning ");
		System.out.println("Additional Services : Ac vent cleaning \t AC Inspection\t AC leak test \t Dasshboard removing and fitting\t Dashboard cleaning \n \n ");
		System.out.println("CHARGES: 4000 Rs.0\n\n\n\n");
		
		System.out.println("1 to confirm your service");
		System.out.println("0 for back");
		int p = ac.nextInt();
		if (p==0) {  acService() ; }
		else if(p==1) 
		{
			finalList(4000,"High Performance AC service" );
			
		} 
		 break;
		 
	case 0:scheduledService();
	break;
	
	default : System.out.println("choose proper option ");
	acService() ;
	break;
	}
	
	
}

// AC END

// TYRE START 
public void wheelCare() 
{
	System.out.println("******WHEEL CARE******");
	System.out.println("1 FOR APOLLO");
	System.out.println("2 FOR MRF");
	System.out.println("3 FOR JK");
	System.out.println("4 FOR GOODYEAR");
	System.out.println("5 FOR BRIDGESTONE");
	System.out.println("0 FOR BACK");
	
	Scanner wc = new Scanner(System.in);
	int w =wc.nextInt();
	
	switch(w) 
	{
	case 1 : 
		System.out.println("APOLLO ALNAC");
		System.out.println("Size: 175/65R15 84H \n warranty: 5 year \n Tubless \n Price : 5000 Rs. ");
		
		System.out.println("1 to confirm your service");
		System.out.println("\n\n\n 0 for back ");
		int o =  wc.nextInt();
		if (o==0) { wheelCare()  ; }
		else if(o==1) 
		{
			finalList(5000,"APOLLO ALNAC" );
			
		} 
		break;
		
	case 2 : 
		System.out.println("MRF");
		System.out.println("Size: 175/65R15 84TL \n warranty: 6 year  \n Tubless \n Cost  : 5500 Rs. ");
		
		System.out.println("1 to confirm your service");
		System.out.println("\n\n\n 0 for back ");
		int p =  wc.nextInt();
		if (p==0) { wheelCare()  ; }
		else if(p==1) 
		{
			finalList(5500,"MRF" );
			
		} 
		
		break;
		
	case 3 : 
		System.out.println("JK UX ROYALE");
		System.out.println("Size: 175/65R15  \n warranty: 5 year  \n Tubless \n Price : 5300 Rs. ");
		
		System.out.println("1 to confirm your service");
		System.out.println("\n\n\n 0 for back ");
		int q =  wc.nextInt();
		if (q==0) { wheelCare()  ; }
		else if(q==1) 
		{
			finalList(5300,"JK UX ROYALE" );
			
		} 
		break;
		
	case 4 : 
		System.out.println("GOODYEAR Assurance TripleMax");
		System.out.println("Size: 175/65R15 88S \n warranty: 5 year  \n Tubless \n Price : 5200 Rs. ");
		
		System.out.println("1 to confirm your service");
		System.out.println("\n\n\n 0 for back ");
		int r =  wc.nextInt();
		if (r==0) { wheelCare()  ; }
		else if(r==1) 
		{
			finalList(5200,"GOODYEAR ASSURANCE TRIPLEMAX" );
			
		} 
		break;
		
		
	case 5 : 
		System.out.println("Bridgestone");
		System.out.println("Size: 175/65R15 84T \n warranty: 5 year  \n Tubless \n Price : 5900 Rs. ");
		
		System.out.println("1 to confirm your service");
		System.out.println("\n\n\n 0 for back ");
		int s =  wc.nextInt();
		if (s==0) { wheelCare()  ; }
		else if(s==1) 
		{
			finalList(5900,"BRIDGESTONE" );
			
		} 
		break;
		
		
		
	
	}
	 
}
  public void  batteryService()
{
	System.out.println("******Battery Service******");
	System.out.println("1 Exide");
	System.out.println("2 Amaron ");
	
	
	System.out.println("0 FOR BACK");
	
	Scanner bc= new Scanner(System.in);
	int n = bc.nextInt();
	switch (n)
	
	{
	case 1:System.out.println("Exide\n Size: 35 Amp Hour \n Warranty: 55 months \n Price:4300");
	
	System.out.println("\n\n\n 0 to back ");
	System.out.println("1 to confirm your service");
	int o = bc.nextInt();
	if (o==0) {   batteryService(); }
	else if(o==1) 
	{
		finalList(4300,"Battery of Exide" );
		
	} 
			break;
	
	case 2:System.out.println("AMRON \n Size: 35 Amp Hour \n Warranty: 55 months\n Price:4300");
	
	System.out.println("\n\n\n 0 to back ");
	System.out.println("1 to confirm your service");
	int p = bc.nextInt();
	if ( p==0) {   batteryService(); }
	else if(p==1) 
	{
		finalList(4300,"Battery of Amron" );
		
	} 
	break;
	
	
	default : System.out.println("Please chosse right Option ");
	 batteryService();
	break;
	
	
	case 0:scheduledService() ;
	break;
	
	
	}
	
}


  
   public void valueAddedServices() 
   //method start 
   {

  		System.out.println(" SELECT SERVICE WHICH YOU WANT \n");
  		
  		System.out.println("1 for DENTING & PAINTING");
  		System.out.println("2 for DEATAILING SERVICES");
  		System.out.println("3 for CAR SPA & CLEAING ");
  		System.out.println("0 for BACK ");
  		Scanner ab = new Scanner(System.in);
  		int a= ab.nextInt();	
  		
  		switch(a)
  		{
  		case 1:System.out.println("***DENTING & PAINTING***");
  		System.out.println("1 for Front Bumper Paint ");
  		System.out.println("2 for Front Bonet  Paint ");
  		System.out.println("3 for Rear Bumper Paint ");
  		System.out.println("4 for Front Boot Paint ");
  		System.out.println("5 for Full Body Dent Paint ");
  		System.out.println("6 for Alloy  Paint ");
  		System.out.println("7 for left  Fender Paint ");
  		System.out.println("8 for left  Front Door Paint ");
  		System.out.println("9 for left  Rear Door Paint ");
  		System.out.println("10 for  Left Quarter Panel Paint ");
  		System.out.println("11 for left Running Board Paint ");
  		System.out.println("12 for Right  Fender Paint ");
  		System.out.println("13 for Right  Front Door  Paint ");
  		System.out.println("14 for Right  Rear Door Paint ");
  		System.out.println("15 for Right  Quarter Panel Paint ");
  		System.out.println("16 for Right  Running Board Paint \n\n\n");
  		
  		Scanner wc = new Scanner(System.in);
  		int w =wc.nextInt();
  		switch (w) 
  		{
  		case 1: 
  		System.out.println("Front bumper paint ");
  		System.out.println("what includes:");
  		System.out.println("grade 'A' primer");
  		System.out.println("premium dupont paint");
  		System.out.println("4 layer of painting ");
  		System.out.println("panel rubbing polishing \n\n\n");
  		 System.out.println("Charges: 2400 Rs.");
  		 
  		System.out.println("1 to confirm your service");
  		 System.out.println(" press 0 to back");
  		 
  		 int g =  wc.nextInt();
  			if (g==0) {valueAddedServices(); }
  			else if(g==1) 
  			{
  				finalList(2400,"Front bumper paint" );
  				
  			} 
  			
  		break;
  		
  		case 2: 
  			System.out.println("Front Bonet  Paint ");
  			System.out.println("what includes:");
  			System.out.println("grade 'A' primer");
  			System.out.println("premium dupont paint");
  			System.out.println("4 layer of painting ");
  			System.out.println("panel rubbing polishing \n\n\n");
  			 System.out.println("Charges: 2400 Rs.");
  			 
  			System.out.println("1 to confirm your service");
  			 System.out.println(" press 0 to back");
  			 
  			 int h =  wc.nextInt();
  				if (h==0) {valueAddedServices(); }
  				else if(h==1) 
  	  			{
  	  				finalList(2400,"Front Bonet paint" );
  	  				
  	  			} 
  			break;
  			
  		case 3: 
  			System.out.println("Rear Bumper Paint ");
  			System.out.println("what includes:");
  			System.out.println("grade 'A' primer");
  			System.out.println("premium dupont paint");
  			System.out.println("4 layer of painting ");
  			System.out.println("panel rubbing polishing \n\n\n");
  			 System.out.println("Charges: 2400 Rs.");
  			 
  			System.out.println("1 to confirm your service");
  			 System.out.println(" press 0 to back");
  			 
  			 int i =  wc.nextInt();
  				if (i==0) {valueAddedServices(); }
  				else if(i==1) 
  	  			{
  	  				finalList(2400,"Rear bumper paint" );
  	  				
  	  			} 
  			break;
  		
  		case 4: 
  			System.out.println("Front boot Paint ");
  			System.out.println("what includes:");
  			System.out.println("grade 'A' primer");
  			System.out.println("premium dupont paint");
  			System.out.println("4 layer of painting ");
  			System.out.println("panel rubbing polishing \n\n\n");
  			 System.out.println("Charges: 2400 Rs.");
  			 
  			System.out.println("1 to confirm your service");
  			 System.out.println(" press 0 to back");
  			 
  			 
  			 int k=  wc.nextInt();
  				if (k==0) {valueAddedServices(); }
  				else if(k==1) 
  	  			{
  	  				finalList(2400,"Front Boot paint" );
  	  				
  	  			} 
  				
  			break;
  		case 5: 
  			System.out.println("Full Body Dent Paint ");
  			System.out.println("what includes:");
  			System.out.println("grade 'A' primer");
  			System.out.println("premium dupont paint");
  			System.out.println("4 layer of painting ");
  			System.out.println("panel rubbing polishing \n\n\n");
  			 System.out.println("Charges: 31000 Rs.");
  			 
  			System.out.println("1 to confirm your service");
  			 System.out.println(" press 0 to back");
  			 
  			 int j =  wc.nextInt();
  				if (j==0) {valueAddedServices(); }
  				else if(j==1) 
  	  			{
  	  				finalList(31000,"Full body dent paint" );
  	  				
  	  			} 
  				
  			break;
  			
  		case 6: 
  			System.out.println("for Alloy  Paint");
  			System.out.println("what includes:");
  			System.out.println("grade 'A' primer");
  			System.out.println("High temprature paint");
  			System.out.println("4 layer of painting ");
  			System.out.println("alloy preservation\n\n\n");
  			 System.out.println("Charges:1200 Rs.");
  			 
  			System.out.println("1 to confirm your service");
  			 System.out.println(" press 0 to back");
  			 
  			 int l =  wc.nextInt();
  				if (l==0) {valueAddedServices(); }
  				else if(l==1) 
  	  			{
  	  				finalList(1200,"Alloy paint" );
  	  				
  	  			} 
  				
  			break;
  			
  		case 7: 
  			System.out.println("left  Fender Paint ");
  			System.out.println("what includes:");
  			System.out.println("grade 'A' primer");
  			System.out.println("premium dupont paint");
  			System.out.println("4 layer of painting ");
  			System.out.println("panel rubbing polishing \n\n\n");
  			 System.out.println("Charges: 2400 Rs.");
  			 
  			System.out.println("1 to confirm your service");
  			 System.out.println(" press 0 to back");
  			 
  			 int n =  wc.nextInt();
  				if (n==0) {valueAddedServices(); }
  				else if(n==1) 
  	  			{
  	  				finalList(2400,"Left fender paint" );
  	  				
  	  			} 
  				
  			break;
  			
  		case 8: 
  			System.out.println("left  Front Door Paint ");
  			System.out.println("what includes:");
  			System.out.println("grade 'A' primer");
  			System.out.println("premium dupont paint");
  			System.out.println("4 layer of painting ");
  			System.out.println("panel rubbing polishing \n\n\n");
  			 System.out.println("Charges: 2400 Rs.");
  			 
  			System.out.println("1 to confirm your service");
  			 System.out.println(" press 0 to back");
  			 
  			 int m =  wc.nextInt();
  				if (m==0) {valueAddedServices(); }
  				else if(m==1) 
  	  			{
  	  				finalList(2400," left Front door paint" );
  	  				
  	  			} 
  				
  			break;
  			
  		case 9: 
  			System.out.println("left rear Door Paint");
  			System.out.println("what includes:");
  			System.out.println("grade 'A' primer");
  			System.out.println("premium dupont paint");
  			System.out.println("4 layer of painting ");
  			System.out.println("panel rubbing polishing \n\n\n");
  			 System.out.println("Charges: 2400 Rs.");
  			 
  			System.out.println("1 to confirm your service");
  			 System.out.println(" press 0 to back");
  			 
  			 int p =  wc.nextInt();
  				if (p==0) {valueAddedServices(); }
  				else if(p==1) 
  	  			{
  	  				finalList(2400,"Left Rear door paint" );
  	  				
  	  			} 
  				
  				
  			break;
  			
  		case 10: 
  			System.out.println("Left Quarter Panel Paint ");
  			System.out.println("what includes:");
  			System.out.println("grade 'A' primer");
  			System.out.println("premium dupont paint");
  			System.out.println("4 layer of painting ");
  			System.out.println("panel rubbing polishing \n\n\n");
  			 System.out.println("Charges: 2400 Rs.");
  			 
  			System.out.println("1 to confirm your service");
  			 System.out.println(" press 0 to back");
  			 
  			 int s =  wc.nextInt();
  				if (s==0) {valueAddedServices(); }
  				else if(s==1) 
  	  			{
  	  				finalList(2400,"left quarter panel paint" );
  	  				
  	  			} 
  				
  			break;
  			
  		case 11: 
  			System.out.println("left Running Board Paint ");
  			System.out.println("what includes:");
  			System.out.println("grade 'A' primer");
  			System.out.println("premium dupont paint");
  			System.out.println("4 layer of painting ");
  			System.out.println("panel rubbing polishing \n\n\n");
  			 System.out.println("Charges: 2400 Rs.");
  			 
  			System.out.println("1 to confirm your service");
  			 System.out.println(" press 0 to back");
  			 
  			 int t =  wc.nextInt();
  				if (t==0) {valueAddedServices(); }
  				else if(t==1) 
  	  			{
  	  				finalList(2400,"left running board paint" );
  	  				
  	  			} 
  				
  			break;
  			
  		case 12: 
  			System.out.println("Right  Fender Paint ");
  			System.out.println("what includes:");
  			System.out.println("grade 'A' primer");
  			System.out.println("premium dupont paint");
  			System.out.println("4 layer of painting ");
  			System.out.println("panel rubbing polishing \n\n\n");
  			 System.out.println("Charges: 2400 Rs.");
  			 
  			System.out.println("1 to confirm your service");
  			 System.out.println(" press 0 to back");
  			 
  			 int u =  wc.nextInt();
  				if (u==0) {valueAddedServices(); }
  				else if(u==1) 
  	  			{
  	  				finalList(2400,"Right Fender paint" );
  	  				
  	  			} 
  				
  			break;
  			
  	
  		case 13: 
  			System.out.println(" Right  Front Door  Paint ");
  			System.out.println("what includes:");
  			System.out.println("grade 'A' primer");
  			System.out.println("premium dupont paint");
  			System.out.println("4 layer of painting ");
  			System.out.println("panel rubbing polishing \n\n\n");
  			 System.out.println("Charges: 2400 Rs.");
  			 
  			System.out.println("1 to confirm your service");
  			 System.out.println(" press 0 to back");
  			 
  			 int v =  wc.nextInt();
  				if (v==0) {valueAddedServices(); }
  				else if(v==1) 
  	  			{
  	  				finalList(2400," Right Front door paint" );
  	  				
  	  			} 
  				
  			break;
  			
  		case 14: 
  			System.out.println("Right  Rear Door Paint  ");
  			System.out.println("what includes:");
  			System.out.println("grade 'A' primer");
  			System.out.println("premium dupont paint");
  			System.out.println("4 layer of painting ");
  			System.out.println("panel rubbing polishing \n\n\n");
  			 System.out.println("Charges: 2400 Rs.");
  			 
  			System.out.println("1 to confirm your service");
  			 System.out.println(" press 0 to back");
  			 
  			 int x =  wc.nextInt();
  				if (x==0) {valueAddedServices(); }
  				else if(x==1) 
  	  			{
  	  				finalList(2400,"Right Rear door paint" );
  	  				
  	  			} 
  				
  			break;
  			
  		case 15: 
  			System.out.println("Right  Quarter Panel Paint  ");
  			System.out.println("what includes:");
  			System.out.println("grade 'A' primer");
  			System.out.println("premium dupont paint");
  			System.out.println("4 layer of painting ");
  			System.out.println("panel rubbing polishing \n\n\n");
  			 System.out.println("Charges: 2400 Rs.");
  			 
  			System.out.println("1 to confirm your service");
  			 System.out.println(" press 0 to back");
  			 
  			 int y =  wc.nextInt();
  				if (y==0) {valueAddedServices(); }
  				else if(y==1) 
  	  			{
  	  				finalList(2400,"Right Quarter panel paint" );
  	  				
  	  			} 
  				
  			break;
  			
  		case 16: 
  			System.out.println("Right  Running Board Paint ");
  			System.out.println("what includes:");
  			System.out.println("grade 'A' primer");
  			System.out.println("premium dupont paint");
  			System.out.println("4 layer of painting ");
  			System.out.println("panel rubbing polishing \n\n\n");
  			 System.out.println("Charges: 2400 Rs.");
  			 
  			System.out.println("1 to confirm your service");
  			 System.out.println(" press 0 to back");
  			 
  			 int z =  wc.nextInt();
  				if (z==0) {valueAddedServices(); }
  				else if(z==1) 
  	  			{
  	  				finalList(2400," Right Running board paint" );
  	  				
  	  			} 
  			break;
  			
  		case 0: valueAddedServices() ;
  		break;
  			
  			default:System.out.println("choose proper option "); 
  			valueAddedServices() ;
  			break;
  		}
  		
  		
  		System.out.println("0  for Back ");
  		break ;
  		
  		
  		case 2:System.out.println("***DEATAILING SERVICES***");
  		System.out.println("1 For Car Polishing ");
  		System.out.println("2 Ceramic Coating ");
  		System.out.println("3 Taflon Coating  ");
  		System.out.println("4 PPF ");
  		System.out.println("5 Anti Rust underbody Coating ");
  		System.out.println("\n\n\n ");
  		
  		
  		System.out.println(" 0 For Back ");
  		Scanner sc = new Scanner (System.in);
  		int d= sc.nextInt();
  		switch (d) 
  		{
  		case 1:
  			System.out.println("**WHAT INCLUDE** \n Pressure car wash\n Tyre Dressing \n Alloy polishing   "
  					+ " \n machine rubbing\n ");
  			System.out.println("Cost:3000 Rs.");
  			
  			System.out.println("1 to confirm your service");
 			 System.out.println(" press 0 to back");
 			 
 			 	int x =  sc.nextInt();
 				if (x==0) {valueAddedServices(); }
 				else if(x==1) 
 	  			{
 	  				finalList(3000," Car Polishing" );
 	 
 	  			} 
  			break;
  			
  		case 2:
  			System.out.println("**WHAT INCLUDE** \n Complete paint correction \n 2 Layer of coating \n "
  					+ "Safety removal of minor scatches \n Deep all round spa \n Exterior car wash\n " );
  			System.out.println("Cost:15000 Rs.");
  			
  				System.out.println("1 to confirm your service");
  				System.out.println(" press 0 to back");
			 
  			    int y =  sc.nextInt();
				if (y==0) {valueAddedServices(); }
				else if(y==1) 
	  			{
	  				finalList(15000,"Ceramic coating " );
	 
	  			} 
  			break;	
  			
  		case 3:
  			System.out.println("**WHAT INCLUDE** \n Pre coating rubbing polishing \n Ultra shine polishing \n"
  					+ " Safety removal of minor scatches \n Exterior car wash\n " );
  			System.out.println("Cost:5000 Rs.");
  			
  			System.out.println("1 to confirm your service");
			System.out.println(" press 0 to back");
		 
		    int z =  sc.nextInt();
			if (z==0) {valueAddedServices(); }
			else if(z==1) 
  			{
  				finalList(5000,"Taflon  coating " );
  			} 
  			break;
  			
  		case 4:
  			System.out.println("**WHAT INCLUDE** \n PPF- Paint protection film \n Protect OEM paint \n"
  					+ " Stain and fed resistance can be Removed safely \n  Free pickup & drop \n " );
  			System.out.println("Cost:50000 Rs.");
  			
  			System.out.println("1 to confirm your service");
			System.out.println(" press 0 to back");
		 
			int b =  sc.nextInt();
			if (b==0) {valueAddedServices(); }
			else if(b==1) 
  			{
  				finalList(50000,"PPF coating " );
 
  			} 
  			break;	
  			
  		case 5:
  			System.out.println("**WHAT INCLUDE** \n Underbody rust protection \n 3M Protective Anti- Corrosion treatment \n"
  					+ "Insulation and rust protection " );
  			System.out.println("Cost:3000 Rs.");
  			
  			System.out.println("1 to confirm your service");
			System.out.println(" press 0 to back");
		 
		    int c =  sc.nextInt();
			if (c==0) {valueAddedServices(); }
			else if(c==1) 
  			{
  				finalList(3000,"Anti Rust underbody Coating " );
 
  			} 
			
  			break;
  			
  		
  			
  		case 0:valueAddedServices() ;
  			
  			break ;
  			
  		default:System.out.println(" Choose proper option ");
  				valueAddedServices() ;
  				
  			break;
  				
  		}
  		
  		break;
  		
  		case 3:System.out.println("***CAR SPA & CLEAING***");
  		
  		System.out.println("1 car Interior spa ");
  		System.out.println("2 Deep all round spa  ");
  		System.out.println("3 Car Rubbing and Polishing");
  		System.out.println("4 Rat repellent treatment  ");
  		System.out.println("5 Sunroof service\n\n\n ");
  		
  		System.out.println("0 For Back");
  		
  		Scanner sp = new Scanner (System.in);
  		int e= sp.nextInt();
  		switch (e) 
  		{
  		case 1:System.out.println("**WHAT INCLUDES** \n Pressure car wash \n Anti viral bacterial treatment \n "
  				+ "Interior vaccume cleaning\n Dashboard polishing \n Interior wet shampooing and detailing \n");
  				System.out.println("Cost :1400 Rs.");

  	  			System.out.println("1 to confirm your service");
  				System.out.println(" press 0 to back");
  			 
  			    int c =  sp.nextInt();
  				if (c==0) {valueAddedServices(); }
  				else if(c==1) 
  	  			{
  	  				finalList(1400,"Car Interior spa" );
  	 
  	  			} 
  				break ;
  				
  		case 2:System.out.println("**WHAT INCLUDES** \n Interior vaccuming \n Rubbing with compound \n Wax polishing \n "
  				+ "Machine rubbing \n Tyre dressing \n Alloy polishing \n Pressure car wash \n Anti viral bacterial treatment \n "
  				+ "Interior vaccume cleaning\n Dashboard polishing \n Interior wet shampooing and detailing \n");
  				System.out.println("Cost :2000 Rs.");

  	  			System.out.println("1 to confirm your service");
  				System.out.println(" press 0 to back");
  			 
  			    int f =  sp.nextInt();
  				if (f==0) {valueAddedServices(); }
  				else if(f==1) 
  	  			{
  	  				finalList(2000,"Deep all round spa" );
  	 
  	  			} 
  				
  				break ;		
  		
  		case 3:System.out.println("**WHAT INCLUDES** \n Pressure car wash \n Machine rubbing with compund \n "
  				+ "Wax polishing \n Tyre dressing \n Alloy polishing \n");
  				System.out.println("Cost :1500 Rs.");
  				
  				System.out.println("1 to confirm your service");
  				System.out.println(" press 0 to back");
  			 
  			    int g=  sp.nextInt();
  				if (g==0) {valueAddedServices(); }
  				else if(g==1) 
  	  			{
  	  				finalList(2000,"Deep all round spa" );
  	 
  	  			} 
  				break ;
  				
  		case 4:System.out.println("**WHAT INCLUDES** \n Rat repellent treatment \n Sprayed on underbody and engine bay\n"
  				+ "Protects car wiring from pests \n Prevents pests breeding inside car \n Free pickup & drop \n");
  				System.out.println("Cost :1400 Rs.");
  				
  				System.out.println("1 to confirm your service");
  				System.out.println(" press 0 to back");
  			 
  			    int h=  sp.nextInt();
  				if (h==0) {valueAddedServices(); }
  				else if(h==1) 
  	  			{
  	  				finalList(1400,"Rat repellant treatment " );
  	 
  	  			} 
  				break ;		
  				
  		case 5:System.out.println("**WHAT INCLUDES** \n Roof opening +refitting \n Sunroof lubrication \n "
  				+ "Drainage tube clog/debris removal\n sunroof cleaning \n");
  				System.out.println("Cost :2200 Rs.");
  				
  				System.out.println("1 to confirm your service");
  				System.out.println(" press 0 to back");
  			 
  			    int i=  sp.nextInt();
  				if (i==0) {valueAddedServices(); }
  				else if(i==1) 
  	  			{
  	  				finalList(2200,"Sunroof service" );
  	 
  	  			} 
  				break ;	
  				
  		case 0:valueAddedServices() ;
  				break;
  				
  		default :System.out.println("Choose proper option ");
  				valueAddedServices() ;
  				break;
  				
  			
  				
  		}
  		
  		break;
  		
  		
  		
  		case 0: scheduledService () ;
  		break;
  			
  		
  		default:System.out.println("Please choose right option ");
  		valueAddedServices() ;
  		break;
  	
  		}
   }
   // method end 
   
   public void finalList(double cost, String name) 
	{Scanner sc =new Scanner(System.in);
	
	   System.out.println("Enter your pickup date ");
	   String date= sc.nextLine();
	   
		System.out.println("\n\n\nYou select: "+ name );
		System.out.println("Charges: "+ cost );
		System.out.println("Your service  date is : "+ date);
		System.out.println("Your service advisor will be MANISH PATIL (9874563210)\n\n");
		
		System.out.println("0 for payment process");
		int a = sc.nextInt();
		if (a==0) { paymentOptions() ;}
		
		
	}
   
   public void paymentOptions  ()
   {   Scanner sc = new Scanner (System.in);
	   System.out.println("1 Card payment ");
	   System.out.println("2 Cash ");
	   int a= sc.nextInt();
	   
	   switch(a) 
	   {
	   case 1:System.out.println("Enter your card number ");
	   		long num=sc.nextLong();
	   		 System.out.println("Enter your CVV");
	   		  int cvv=sc.nextInt();
	   		  System.out.println("Enter your password");
	   		 int pass=sc.nextInt();
	   		 
	   		ATMDeatils ref2 = new ATMDeatils ();
	   		ref2.verification(num,cvv,pass);
	   		break;
	   		
	   case 2 :System.out.println("Be available with cash ");	
	   		break;
	   		
	   
	   		
	   default:System.out.println("Choose proper option ");
	   paymentOptions  ();
	   
	   break;
	   
	   		
	    
	   }
	
   }
   
   
  }
  //class end



