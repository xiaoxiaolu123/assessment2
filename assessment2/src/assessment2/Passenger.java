package assessment2;

public class Passenger {
	private String passengerName;
	private int passengerAge;
	private String  dietaryRequirement;
	public Passenger(String passengerName,int passengerAge,String dietaryRequirement) {
		// TODO Auto-generated constructor stub
		setDietaryRequirement(dietaryRequirement);
		setPassengerAge(passengerAge);
		setPassengerName(passengerName);
	}
	public String getPassengerName() {
		return passengerName;
	}
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}
	public int getPassengerAge() {
		return passengerAge;
	}
	public void setPassengerAge(int passengerAge) {
		 if(passengerAge>0) this.passengerAge = passengerAge;
	}
	public String getDietaryRequirement() {
		return dietaryRequirement;
	}
	public void setDietaryRequirement(String dietaryRequirement) {
		this.dietaryRequirement = dietaryRequirement;
	}
	
}
