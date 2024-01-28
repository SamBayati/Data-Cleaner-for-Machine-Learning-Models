

import java.util.ArrayList;

public class staff extends Staff_Information
{
	private static int MAX_NUM_CUSTOMERS = 3; // maximum number of clients that a employee can be responsible for


	protected String contract_date;  // this is the date in which the staff has been hired
	protected String work_shift; // work shit - 00-08 or 08-16 or 16-00



	// value for Stroing the current customers:
	private static ArrayList<Customer> customer = new ArrayList<>();

	// value for storing the staff work availability:
	private static boolean canDoubleShift ;
	private ArrayList<Customer> customerList;


	/**
	 * Constructor
	 * @param fn Full Name
	 * @param rn id Number
	 * @param em Email
	 * @param c Contract date
	 * @param ws Work shift
	 */



	public void Staff(String fn, int rn, String em, String c, String ws) {
		this.fullName = fn;
		this.idNumber = rn;
		this.email = em;
		this.contract_date = c;
		this.work_shift = ws;
	}
	// Constructor for the staff :
	public staff(String fn, int rn, String em, String c, String ws, boolean canDoubleShift, ArrayList<Customer> CustomerList) {
		this.canDoubleShift = canDoubleShift;

		this.customerList = new ArrayList<Customer>();

	}
	/*
	private void staffAvai (boolean canDoubleShift, ArrayList<Customer> CustomerList){
		this.canDoubleShift = canDoubleShift;
		this.CustomerList = new ArrayList<Customer>();
	}


	 */




	public String getContractDate() {
		return contract_date;
	}
	public void setContractDate(String cd) {
		this.contract_date = cd;
	}
	public String getWork_shift() {
		return work_shift;
	}
	public void setWork_shift(String work_shift) {
		this.work_shift = work_shift;
	}


	// getting the customer list :   ---------------------------------------------------
	public ArrayList<Customer> getcustomerList(){
		return getcustomerList();
	}
	// assigning list of the customers to the variable customer list :
	private void setCustomerList(ArrayList<Customer>customerList){
		this.customerList=customerList;
	}
	// -----------------------------------------------------------------------------------



	/**
	 * Add a new customer to the list of customers of the employee
	 * @param addCustomerEvent
	 * -The new customer to be added
	 * @return true if the customer was added successfully
	 */

	// I tried to do the add customer but I dont understand where the error is coming.  so here is my atemp to it

	public boolean addCustomer(Customer addCustomerEvent) {
		return false;
		if(customerList.size() < MAX_NUM_CUSTOMERS){
			customerList.add(addCustomerEvent);
			return true;
		}
		else {
			return false;
		}

	}


	/**
	 * Remove a customer of the list of customers of the employee
	 * @return true if the customer was removed successfully
	 */
	public boolean removeCustomer(Customer d) {
		if (customerList.contains(d)) {
			customerList.remove(d);
			return true;
		} else {
			return false;
		}
	}
	public String toString() {
		return "Staff: " + fullName;
	}
}
