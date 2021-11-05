package assessment2;

public class TravelPay {
	private Passenger passenger;
	private boolean isPay;
	public TravelPay(Passenger passenger) {
		setPassenger(passenger);
		setPay(false);
	}
	public Passenger getPassenger() {
		return passenger;
	}
	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}
	public boolean isPay() {
		return isPay;
	}
	public void setPay(boolean isPay) {
		this.isPay = isPay;
	}
	
	
}
