package assessment2;

public class MainProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TravelTour travelTours[] = new TravelTour[3];
		travelTours[0] = new TravelTour("Guangzhou to Chongqing then back to Guangzhou",1200,980,14);
		travelTours[1] = new TravelTour("Beijing to Jinan",400,320,5);
		travelTours[2] = new TravelTour("Shenyang to Harbin then back to Shenyang",780,650,8);

		Menu menu= new Menu(travelTours);
		menu.run();
	}

}
