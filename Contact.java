package addressBookk;

public  class  Contact {
	
	
	private String email ; 
	private int telephoneNumber ;
	
	
	
	
	public Contact(String email, int telephoneNumber) {
		super();
		this.email = email;
		this.telephoneNumber = telephoneNumber;
	}
	
	
	public Contact() {
		super();
	}


	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getTelephoneNumber() {
		return telephoneNumber;
	}
	public void setTelephoneNumber(int telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}


	
	public String getInfo() {
		return "email=" + email + ", telephoneNumber=" + telephoneNumber ;
	}


	
	
	
	
	

}
