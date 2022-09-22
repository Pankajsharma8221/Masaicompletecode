package q5;

public class Address {

	private String state;
	private String city;
	private String pincode;
	@Override
	public String toString() {
		return "Address [state=" + state + ", city=" + city + ", pincode=" + pincode + "]";
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public Address(String state, String city, String pincode) {
		super();
		this.state = state;
		this.city = city;
		this.pincode = pincode;
	}
	public Address() {
		super();
	}

	
}
