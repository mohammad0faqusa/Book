package addressBookk;

public class ContactPerson extends Contact {

	
	private String FirstName ; 
	private String SecondName ;  
	public ContactPerson() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ContactPerson(String email, int telephoneNumber) {
		super(email, telephoneNumber);
		// TODO Auto-generated constructor stub
	}

	public ContactPerson(String email, int telephoneNumber, String firstName, String secondName) {
		super(email, telephoneNumber);
		FirstName = firstName;
		SecondName = secondName;
	}

	
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return FirstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	/**
	 * @return the secondName
	 */
	public String getSecondName() {
		return SecondName;
	}

	/**
	 * @param secondName the secondName to set
	 */
	public void setSecondName(String secondName) {
		SecondName = secondName;
	}

	@Override
	public String getInfo() {
		return  "FirstName=" + FirstName + ", SecondName=" + SecondName + "  " + super.getInfo();
	}
	
	

	
}
