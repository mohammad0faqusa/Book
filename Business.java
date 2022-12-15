package addressBookk;


public class Business extends Page {
	private String title ; 
	private String genre ; 
	private ContactBusiness contactBusiness ; 
	private Address address ; 
	private ContactPerson contactPerson ;
	
	
	
	public Business(String title, String genre, Contact contactBusiness, Address address,
			Contact contactPerson) {
		super();
		this.title = title;
		this.genre = genre;
		this.contactBusiness = (ContactBusiness) contactBusiness;
		this.address = address;
		this.contactPerson = (ContactPerson) contactPerson;
		pageNumber++ ; 
	}
	
	
	public Business() {
		super();
		pageNumber ++ ; 
	}

	

	/**
	 * @return the genre
	 */
	public String getGenre() {
		return genre;
	}


	/**
	 * @param genre the genre to set
	 */
	public void setGenre(String genre) {
		this.genre = genre;
	}


	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}


	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}


	/**
	 * @return the contactPerson
	 */
	public ContactPerson getContactPerson() {
		return contactPerson;
	}


	/**
	 * @param contactPerson the contactPerson to set
	 */
	public void setContactPerson(ContactPerson contactPerson) {
		this.contactPerson = contactPerson;
	}


	@Override
	public Contact getContact() {
		// TODO Auto-generated method stub
		return contactBusiness;
	}
	@Override
	public void setContact(Contact contact) {
		// TODO Auto-generated method stub
		this.contactBusiness = (ContactBusiness) contact ; 
	}
	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return this.title ; 
	}
	@Override
	public void setTitle(String title) {
		// TODO Auto-generated method stub
		this.title = title ; 
	}
	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		return "Business " + "title = " + title + "genre" + genre + " " + contactBusiness.getInfo()+
				address.getInfo() + contactPerson.getInfo() ;
	}  
	
	
	

}
