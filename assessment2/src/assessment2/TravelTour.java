package assessment2;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class TravelTour {
	private String route;
	private static int tourNum=0;
	private int adultPrice;
	private int concessionPrice;
	private int duration;
	private int count=0;
	private TravelPay[] travelPays = new TravelPay[20];
	private int payIndex=0;
	private int payNum=0;
	private boolean isGo;
	public TravelTour(String route,int adultPrice,int concessionPrice,int duration) {
		setAdultPrice(adultPrice);
		setConcessionPrice(concessionPrice);
		setDuration(duration);
		setRoute(route);
		tourNum++;
	}
	
	ArrayList<Passenger>passengers=new ArrayList<Passenger>();
	
	public void addDetailsToTravelTour(Passenger _passenger) {
		if(count<20) {
			passengers.add(_passenger);
			count++;
		}else {
			System.out.println("This route is full, please choose another route");
		}
	}
	
	public void addTravelPay(TravelPay travelPay) {
		if(travelPay!=null&&this.payIndex<this.travelPays.length) {
			this.travelPays[this.payIndex]=travelPay;
			this.payIndex++;
		}
	}
	
	
	
	public String getRoute() {
		return route;
	}
	public void setRoute(String route) {
		this.route = route;
	}
	public int getAdultPrice() {
		return adultPrice;
	}
	public void setAdultPrice(int adultPrice) {
		this.adultPrice = adultPrice;
	}
	public int getConcessionPrice() {
		return concessionPrice;
	}
	public void setConcessionPrice(int concessionPrice) {
		this.concessionPrice = concessionPrice;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public static int getTourNum() {
		return tourNum;
	}
	public static void setTourNum(int tourNum) {
		TravelTour.tourNum = tourNum;
	}
	
}
