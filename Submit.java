import javax.swing.*;
import java.awt.event.*;

/**
 * Listener for Submit button. Adding new customer to the list of orders or updating existing one.
 * @author Maria Grazia
 * @version 2 Oct 2017
 *
 */

public class Submit implements ActionListener {
	private JTextField name;
	private JTextField product;
	private JTextField amount;
	private Model model;

	/**
	 * Costructor
	 * @param name of customer
	 * @param product ordered
	 * @param amount of product ordered
	 * @param model
	 */
	public Submit(JTextField name, JTextField product, JTextField amount, Model model) {
		this.name = name;
		this.product = product;
		this.amount = amount;
		this.model = model;
	}

	/**
	 * Adding or updating orders through the model.
	 */
	@Override
	public void actionPerformed(ActionEvent arg0) {	
		String name = this.name.getText(); 
		String product = this.product.getText();
		String amount = this.amount.getText();

		model.createListItem(name, product, amount);
	}
}