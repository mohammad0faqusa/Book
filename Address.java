package addressBookk;

public class Address {

	private String country ; 
	private String City ; 
	private String postalCode ;
	public Address(String country, String city, String postalCode) {
		super();
		this.country = country;
		City = city;
		this.postalCode = postalCode;
	}
	public Address() {
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getInfo() {
		return "Address [country=" + country + ", City=" + City + ", postalCode=" + postalCode + "]";
	}
	
	
	
	
}
