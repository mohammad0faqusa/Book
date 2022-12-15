package addressBookk;

public class Person extends Page {
	
	private ContactPerson contact ; 
	private Address address ; 
	private Date date ; 
	
        public static int personNumber = 0  ; 
	public Person(Contact contact, Address address, Date date) {
		super();
		this.contact = (ContactPerson) contact;
		this.address = address;
		this.date = date;
		pageNumber++  ;
                personNumber ++ ; 
	}

	public Person() {
		super();
		pageNumber ++ ; 
                personNumber ++ ; 
		// TODO Auto-generated constructor stub
	}

	public Person(ContactPerson contact) {
		super();
		this.contact = contact;
		pageNumber ++ ; 
                personNumber ++  ; 
	}

	@Override
	public Contact getContact() {
		// TODO Auto-generated method stub
		return (ContactPerson) contact ;
		
	}

	@Override
	public void setContact(Contact contact) {
		// TODO Auto-generated method stub
		this.contact = (ContactPerson) contact ;
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return this.contact.getFirstName() +" " +  this.contact.getSecondName();
	}

	@Override
	public void setTitle(String title) {
		// TODO Auto-generated method stub
		String [] sup = title.split(" ") ; 
		this.contact.setFirstName(sup[0]);
		this.contact.setSecondName(sup[1]); 
		
	}

	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		return "Person " + contact.getInfo() + address.getInfo() + date.getInfo() ;
	}
	
}
