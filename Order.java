import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Class to create a list of orders. Map data structure has been used: keys are the customers and values the products ordered and their amount.
 * @author Maria Grazia
 * @version 2 Oct 2017
 */
public class Order {
	private Map<String, ArrayList<String>> listOfOrders = new HashMap<String, ArrayList<String>>();

	/**
	 * Constructor
	 * @param listOfOrders
	 */
	public Order(Map<String, ArrayList<String>> listOfOrders) {
		this.listOfOrders = listOfOrders;

	}

	/**
	 * Getter
	 * @return the list of the orders
	 */
	public Map<String, ArrayList<String>> getListOfOrders() {
		return listOfOrders;
	}

	/**
	 * Setter
	 * @param listOfOrders
	 */
	public void setListOfOrders(Map<String, ArrayList<String>> listOfOrders) {
		this.listOfOrders = listOfOrders;
	}

	/**
	 * toString method
	 */
	public String toString() {
		for (Map.Entry entry : listOfOrders.entrySet()) {
			String customer = entry.getKey().toString();
			ArrayList<String> ar = (ArrayList<String>) entry.getValue();
			System.out.println(customer + ", " + ar.toString());
		}
		return null;
	}
	
	/**
	 * Getting values for a customer
	 * @param customer
	 * @return
	 */
	public ArrayList<String> getValues(String customer) {
		ArrayList<String> a = new ArrayList<String>();
		a = listOfOrders.get(customer);
		return a;
		
	}

	/**
	 * Adding a new order
	 * @param customer
	 * @param product
	 * @param amount
	 */
	public void addNewOrder(String customer, String product, String amount) {
		ArrayList<String> ar = new ArrayList<String>();
		ar.add(product);
		ar.add(amount);
		listOfOrders.put(customer, ar);
	}

	/**
	 * Adding orders of existing customer
	 * @param customer
	 * @param product
	 * @param amount
	 */
	public void updateExistingOrder(String customer, String product, String amount) {
		listOfOrders.get(customer).add(product);
		listOfOrders.get(customer).add(amount);
	}
	
	public static void main(String args) {
		ArrayList<String> a = new ArrayList<String>();
		a.add("coca");
		Map<String, ArrayList<String>> l = new HashMap<String, ArrayList<String>>();
		l.put("anna", a);
		Order o = new Order(l);
		System.out.println(o);
		System.out.println(o.getValues("anna").toString());
	}
}
