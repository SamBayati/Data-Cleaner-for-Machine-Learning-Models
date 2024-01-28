import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


/**
 *  This class maintains an ArrayList that stores a list of companies and graph that indicates the relationship of those companies.
 *  Your task is to correctly implement the method bodies for:
 * 
 *  	protected boolean isConnected(Graph graph, Company i, Company j)
 *  	protected ArrayList<Company> mergeSort(ArrayList<Company> list, boolean ascending, String attr)
 *  
 *  The above methods are called via public methods of the same name which supply 
 *  the local modules object as a parameter. You can observe calls to these public
 *  methods in the go method of ManagerTest.java.  
 */
public class MultinationalManager
{
	private static ArrayList<Company> companies;
	private static Graph graph;
	
	public MultinationalManager()
	{
		companies = new ArrayList<Company>();
		graph = new Graph();
	}
	
	/**
	 * Cleans the object
	 */
	public void clear()
	{
		for (Company v : companies)
		{
			v.getBtree().clear();
		}
		companies.clear();
		graph = new Graph();
	}
	/**
	 * Add a company
	 * @param v the new company
	 */
	public void addCompany(Company v)
	{
		companies.add(v);
	}
	/**
	 * Get all companies
	 * @return An arraylist of companies
	 */
	public ArrayList<Company> getCompanies()
	{
		return companies;
	}
	/**
	 * Get the graph
	 * @return the graph
	 */
	public Graph getGraph()
	{
		return graph;
	}
	/**
	 * Add a new relationship (i.e., edge) between two companies (i <-> j)
	 * @param i Company
	 * @param j Company
	 */
	public void addRelationship(Company i, Company j) {
		graph.insertEdge(i, j);
	}

	public void describeCompanies()
	{
		for (Company v : companies)
		{
			System.out.println(v.toString());
			v.describeStudentTree();
		}
	}
	
	/**
	 * This method calls the tree walk method for a specific Company
	 * @param val The index of the company that you want to call the method for
	 * @return A String with the names of all Customers in the tree
	 */
	public String walkTree(int val)
	{
		return companies.get(val).walkTree();
	}
	
	/**
	 * This method calls the find method for a specific Company
	 * @param val The index of the company that you want to call the method for
	 * @param name Name of the customer we are looking for
	 * @return A reference to the Customer that was found or null if no Customer found
	 */
	public Customer find(int val, String name)
	{
		return companies.get(val).find(name);
	}
	
	/**
	 * This method calls the protected isConnected to find if two nodes are somehow connected in the graph.
	 * 
	 * You should not modify this code.
	 */
    public boolean isConnected(Company i, Company j)
    {
    	return isConnected(this.graph, i, j);
    }
    
	/**
	 * This method should search and find if two nodes are somehow connected in an undirected graph.
	 *
     * @param graph The graph
	 * @param i the starting node
	 * @param j the ending node
	 * 
 	 * @return true, if nodes i and j are connected in any way, false otherwise
	 */
    protected boolean isConnected(Graph graph, Company i, Company j)
    {

		// unsuccessful attempt :
		ArrayList<Company> operate = graph.getVertices();
		Queue <Company> operate3 = new LinkedList<>();
		if (operate.size() <= 0)
			return false;
		else if(i==j)
			return true;
		LinkedList<Company> operate4 = graph.getAdj(i);
		int index = operate.indexOf(i);
		boolean[] checkindex = new boolean[0];
		checkindex [index]= true;

		operate3.add(operate4.get(0));
		while (!operate3.isEmpty()){
			Company compN = operate3.remove();
			operate4 = graph.getAdj(compN);
		}
		return false;
    }

	/**
	 * This method should use merge sort approach to rearrange
	 * the references in the ArrayList of 'Company' such that they are in 
	 * order according to the attr (attribute) parameter.
	 * If asc is true, this should be ascending order,
	 * if asc is false, this should be descending order.
	 * 
	 * You should not modify this code.
	 * 
	 * @param asc True if the list should be ascending order, false for descending
     * @param attr Attribute (name or code) that will be use during the sorting
	 * @return	The ArrayList of 'Company' that has been sorted using merge sort
	 */
    public ArrayList<Company> mergeSort(boolean asc, String attr)
    {	
    	ArrayList<Company> sorted = new ArrayList<Company>(companies);
    	return mergeSort(sorted, asc, attr);
    }
    
    /**
	 * This method should use merge sort approach to rearrange
	 * the references in the ArrayList of 'Company' such that they are in 
	 * order according to the attr (attribute) parameter.
	 * If asc is true, this should be ascending order,
	 * if asc is false, this should be descending order.
	 * 
	 * @param list The arraylist to be sorted
	 * @param asc True if the list should be ascending order, false for descending
     * @param attr Attribute (name or code) that will be use during the sorting
	 * @return	The ArrayList of 'Company' that has been sorted using merge sort
	 */
    protected ArrayList<Company> mergeSort(ArrayList<Company> list, boolean ascending, String attr)
    {
		/*
		 * TODO implement here
		 */

		return list;
    }
	public static void merge



}
