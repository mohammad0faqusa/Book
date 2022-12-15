package addressBookk;

public class ContactBusiness extends Contact  {

	private String webSite ;

	public ContactBusiness(String email, int telephoneNumber, String webStie) {
		super(email, telephoneNumber);
		this.webSite = webStie;
	}

	public ContactBusiness() {
		super();
	}

	public ContactBusiness(String email, int telephoneNumber) {
		super(email, telephoneNumber);
		// TODO Auto-generated constructor stub
	}
	
	

	/**
	 * @return the webStie
	 */
	public String getWebStie() {
		return webSite;
	}

	/**
	 * @param webStie the webStie to set
	 */
	public void setWebStie(String webStie) {
		this.webSite = webStie;
	}

	
	@Override
	public String getInfo() {
		return super.getInfo()+" webStie=" + webSite ;
	}

	
	
	
	
	
	
}
