package assessment2;

import java.util.Scanner;

public class Menu {
	private TravelTour[] travelTours=new TravelTour[3];
	private int select=0;
	private Passenger passenger;
	private TravelPay TravelPay;
	private Scanner scanner;
	
	public Menu(TravelTour[] travelTours) {
		this.scanner=new Scanner(System.in);
		this.travelTours=travelTours;
	}
	
	public void run() {
		do {
			System.out.println("The menu directory is1. Add a new passenger to a travel tour (FR-3)\r\n" + 
					"2. Allow a passenger to make their payment (FR-4)\r\n" + 
					"3. Display details of a travel tour (FR-5)\r\n" + 
					"4. Mark a particular travel tour as now departed (FR-6) ");
			System.out.println("Please enter an option");
			select=scanner.nextInt();
			switch (select) {
			case 1:
				System.out.println("Please enter the name of the passenger:");
				String _passengerName =scanner.next();
				System.out.println("Please enter the age of Tim Morrison:");
				int _passengerAge = scanner.nextInt();
				System.out.println("Please enter any dietary requirements of Tim Morrison: ");
				String _dietaryRequirement =scanner.next();
				passenger = new Passenger(_passengerName, _passengerAge, _dietaryRequirement);
				System.out.println("The following travel tours are available:\r\n" + 
						"1. Guangzhou ‐> Chongqing ‐> Guangzhou\r\n" + 
						"2. Beijing ‐> Jinan\r\n" + 
						"3. Shenyang ‐> Harbin ‐> Shenyang");
				int tour=scanner.nextInt();
				tour--;
				travelTours[tour].addDetailsToTravelTour(passenger);
				System.out.println(_passengerName+"has been added to the travel tour: " + travelTours[tour].getRoute() + 
						"and needs to pay " + travelTours[tour].getAdultPrice() + " to confirm the booking on this travel tour.\r\n" );
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			default:System.out.println("Please enter a new number");
				break;
			}
		} while (select!=0);
	}
}
