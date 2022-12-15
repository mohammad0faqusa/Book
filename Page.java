package addressBookk;

public abstract class Page {
	
	public static int pageNumber = 0 ; 
	public abstract Contact getContact() ; 
	public abstract void setContact(Contact contact) ; 
	
	public abstract String getTitle () ; 
	public abstract void setTitle (String title) ; 
	
	public abstract  String getInfo () ; 





	
	public static int getPageNumber() {
		return pageNumber;
	}
}

