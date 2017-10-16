import java.util.ArrayList;
import java.util.Observable;
import java.util.Set;

/**
 * Model wrapping the object Order. It interacts with UI by providing and getting back data about the orders.
 * @author Maria Grazia
 * @version 2 Oct 2017
 */

public class Model extends Observable {
	private Order o;

	/**
	 * Constructor
	 * @param o of type Order
	 */
	public Model(Order o) {
		this.o = o;
	}

	/**
	 * Getter method
	 * @return the order
	 */
	public Order getO() {
		return o;
	}

	/**
	 * Setter method
	 * @param o of the order
	 */
	public void setO(Order o) {
		this.o = o;
	}

	/**
	 * Creating new customer item or updating an existing one.
	 * @param customer
	 * @param product
	 * @param amount
	 */
	public void createListItem(String customer, String product, String amount) {
		if (o.getListOfOrders().containsKey(customer)) {
			o.updateExistingOrder(customer, product, amount);
		} else {
			o.addNewOrder(customer, product, amount);			
		}
		System.out.println(o.toString());
		setChanged();
		notifyObservers();
	}
	
	/**
	 * Listing the customers' names only.
	 * @return the list of customer.
	 */
	public Set listKeys() {
		return o.getListOfOrders().keySet();
	}
	
	/**
	 * Listing what a customer has ordered.
	 * @param customer
	 * @return the orders for that customer
	 */
	public ArrayList<String> valuesPerCustomer(String customer) {
		return o.getValues(customer);
	}
	
	/**
	 * Remove a customer from the list.
	 * @param customer
	 */
	public void deleteCustomer(String customer) {
		o.getListOfOrders().remove(customer);
	}
	
}