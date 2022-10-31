package myMechanic;

import java.util.Scanner;

public class Repairs {
	//maechniaclRepairs start
public void maechniaclRepairs() 
{
	System.out.println(" SELECT SERVICE WHICH YOU WANT \n");
	
	System.out.println("1 for WINDSHIELD AND LIGHTS ");
	
	
	System.out.println("0 for BACK ");
	Scanner ab = new Scanner(System.in);
	int a= ab.nextInt();
	
		switch(a) 
		{
		case 1 :  windshieldNLights () ;
		
		break ;
		
		case 2:
		break;
		
		case 0:
		break;
		
		default:System.out.println("Please select proper option");
			break;
			
		
		}
		
	
}
//maechniaclRepairs end
public void windshieldNLights () 
{
	
	System.out.println("1 for Front windshield replacement  ");
	System.out.println("2 for Rear windshield replacement ");
	System.out.println("3 for Door glass replacement ");
	System.out.println("4 for front headlight ");
	System.out.println("5 for Rear taillight ");
	System.out.println("6 for fog light ");
	System.out.println("7 for side mirror replacement ");
	Scanner ab =  new Scanner(System.in);
	int a= ab.nextInt();
	
	switch (a) 
	{
	case 1:System.out.println("***Front windshield replacement***");
	System.out.println("WHAT INCLUDES :\n\n Windshield (ISI Approved)\n Opening fitting of new winshield");
	System.out.println("Sensor charges additional(if applicable)");
	System.out.println("Consumable- Sealant/Bond/Adhesive");
	System.out.println("Charges: 5700 Rs.");
	break;
	
	case 2:
	System.out.println("***Rear windshield replacement***");
	System.out.println("WHAT INCLUDES :\n\n Windshield (ISI Approved)\n Opening fitting of new winshield");
	System.out.println("Defogger charges additional(if applicable)");
	System.out.println("Consumable- Sealant/Bond/Adhesive");
	System.out.println("Charges: 4000 Rs.");
	break;
	
	
	case 3:
		System.out.println("***Door glass replacement***");
		System.out.println("WHAT INCLUDES :\n\n Door glass (AIS Approved)\n Opening fitting of new door glass");
		System.out.println(" UV glass charges additional(if applicable)");
		System.out.println("Consumable- Bond/Adhesive");
		System.out.println("Charges: 1650 Rs.");
		break;
		

	case 4:
		System.out.println("***front headlight***");
		System.out.println("WHAT INCLUDES :\n\n Headlight OES (Price for single unit )\n Opening fitting of bumper/headlight ");
		System.out.println(" Bulb/LED charges additional(if applicable)");
		System.out.println("Consumable- Bond/Adhesive");
		System.out.println("Charges: 7000 Rs.");
		break;
		
	case 5:
		System.out.println("*** Rear taillight***");
		System.out.println("WHAT INCLUDES :\n\n taillight OES (Price for single unit )\n Opening fitting of bumper/headlight ");
		System.out.println(" Bulb/LED charges additional(if applicable)");
		System.out.println("Consumable- Bond/Adhesive");
		System.out.println("Charges: 5300 Rs.");
		break;
		
	case 6:
		System.out.println("*** Rear fog light ***");
		System.out.println("WHAT INCLUDES :\n\n fog light  (Price for single unit )\n Opening fitting of bumper/headlight ");
		System.out.println(" projector/ LED/DRLs charges additional(if applicable)");
		System.out.println("Consumable- Bond/Adhesive");
		System.out.println("Charges: 5300 Rs.");
		break;
	}
	
}



}
