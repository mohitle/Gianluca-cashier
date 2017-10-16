import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.*;

public class Form  extends JPanel {
	private Model model;
	
	public Form (Model model){
		this.model = model;
		setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.gray), "Order"));

		GridLayout layout = new GridLayout();
		setLayout(layout);
		layout.setColumns(2);
		layout.setRows(5);
		
		JLabel nameLabel = new JLabel("Name");
		JTextField nameField = new JTextField();
		JLabel productLabel = new JLabel("Product");
		JTextField productField = new JTextField();
		JLabel amountLabel = new JLabel("Amount");
		JTextField amountField = new JTextField();
		
		JLabel label = new JLabel(" ");
		JButton submitButton = new JButton("Submit");
		
		add(nameLabel);
		add(nameField);
		add(productLabel); 
		add(productField);
		add(amountLabel);
		add(amountField);
		
		add(label);
		add(submitButton);
		
		submitButton.addActionListener(new Submit(nameField, productField, amountField, model));
		
	}	
}
