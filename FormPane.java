import java.awt.*;
import javax.swing.*;

/**
 * Pane with order form. User needs to fill in customer name, product and amount.
 * @author Maria Grazia
 * @version 2 Oct 2017
 */
public class FormPane extends JPanel {
	private Model model;
	
	/**
	 * Cosntructor
	 * @param model
	 */
	public FormPane(Model model){
		this.model = model;
		SpringLayout layout = new SpringLayout();
		this.setLayout(layout);

		JLabel nameLabel = new JLabel("Name");
		JTextField nameField = new JTextField(15);
		JLabel productLabel = new JLabel("Product");
		JTextField productField = new JTextField(15);
		JLabel amountLabel = new JLabel("Amount");
		JTextField amountField = new JTextField(15);
		JButton submit = new JButton("Submit");
		
		add(nameLabel);
		add(nameField);
		add(productLabel);
		add(productField);
		add(amountLabel);
		add(amountField);
		add(submit);
		
		layout.putConstraint(SpringLayout.WEST, nameLabel, 10, SpringLayout.WEST, this);
	    layout.putConstraint(SpringLayout.NORTH, nameLabel, 25, SpringLayout.NORTH, this);
	    layout.putConstraint(SpringLayout.NORTH, nameField, 25, SpringLayout.NORTH, this);
	    layout.putConstraint(SpringLayout.WEST, nameField, 60, SpringLayout.WEST, nameLabel); 
	    
	    layout.putConstraint(SpringLayout.WEST, productLabel, 10, SpringLayout.WEST, this);
	    layout.putConstraint(SpringLayout.NORTH, productLabel, 55, SpringLayout.NORTH, this);
	    layout.putConstraint(SpringLayout.NORTH, productField, 55, SpringLayout.NORTH, this);
	    layout.putConstraint(SpringLayout.WEST, productField, 60, SpringLayout.WEST, productLabel);
	    
	   /* layout.putConstraint(SpringLayout.WEST, priceLabel, 10, SpringLayout.WEST, this);
	    layout.putConstraint(SpringLayout.NORTH, priceLabel, 85, SpringLayout.NORTH, this);
	    layout.putConstraint(SpringLayout.NORTH, priceField, 85, SpringLayout.NORTH, this);
	    layout.putConstraint(SpringLayout.WEST, priceField, 60, SpringLayout.WEST, priceLabel);
	   */ 
	    layout.putConstraint(SpringLayout.WEST, amountLabel, 10, SpringLayout.WEST, this);
	    layout.putConstraint(SpringLayout.NORTH, amountLabel, 85, SpringLayout.NORTH, this);
	    layout.putConstraint(SpringLayout.NORTH, amountField, 85, SpringLayout.NORTH, this);
	    layout.putConstraint(SpringLayout.WEST, amountField, 60, SpringLayout.WEST, amountLabel);
	    
	    layout.putConstraint(SpringLayout.WEST, submit, 70, SpringLayout.WEST, this);
	    layout.putConstraint(SpringLayout.NORTH, submit, 115, SpringLayout.NORTH, this);
	    		
		submit.addActionListener(new Submit(nameField, productField, amountField, model));
				
	}

}
