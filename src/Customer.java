
public class Customer extends Staff_Information
{
	protected String fullName;
	protected int idNumber;
	protected String email;
	
	protected int phone;  // phone of the customer
	protected String company;  // company of the customer

	/**
	 * Constructor
	 * @param fn Full name
	 * @param rn id number
	 * @param em email
	 * @param pn phone number
	 * @param company
	 */
	public Customer(String fn, int rn, String em, int pn, String c) {
		this.fullName = fn;
		this.idNumber = rn;
		this.email = em;

		this.phone = pn;
		this.company = c;
	}

	// gets and sets
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fn) {
		this.fullName = fn;
	}
	public int getIdNumber(){
		return idNumber;
	}
	public void setIdNumber(int rn) {
		this.idNumber = rn;
	}
	public String getEmail(){
		return email;
	}
	public void setEmail(String em) {
		this.email = em;
	}

	public int getTableNum() {
		return phone;
	}
	public void setTableNum(int tableNum) {
		this.phone = tableNum;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String c) {
		this.company = c;
	}

	/**
	 * Get a description of this class as a String
	 */
	public String toString() {
		return "Customer - Name: " + fullName + " - Company: " + company;
	}

}
