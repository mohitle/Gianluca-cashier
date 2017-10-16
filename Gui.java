import javax.swing.*;
import java.awt.*;

public class Gui extends JFrame{
	
	public Gui(){
	JPanel north = new JPanel();
	north.add(new JLabel("Gianluca's orders"));
		
	////
	JFrame frame = new JFrame();
	//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	Container contentPane = frame.getContentPane();
	
	SpringLayout layout = new SpringLayout();
	contentPane.setLayout(layout);
	
	JLabel nameLabel = new JLabel("Name");
	JTextField nameField = new JTextField(15);
	contentPane.add(nameLabel);
	contentPane.add(nameField);
	
	JLabel productLabel = new JLabel("Product");
	JTextField productField = new JTextField(15);
	contentPane.add(productLabel);
	contentPane.add(productField);
	String productRec = productField.getText();
	
	JLabel priceLabel = new JLabel("Price");
	JTextField priceField = new JTextField(15);
	contentPane.add(priceLabel);
	contentPane.add(priceField);
	String priceRec = priceField.getText();

	
	JLabel amountLabel = new JLabel("Amount");
	JTextField amountField = new JTextField(15);
	contentPane.add(amountLabel);
	contentPane.add(amountField);
	String amountRec = amountField.getText();

	
	JButton submit = new JButton("Submit");
	contentPane.add(submit);
	
	
	frame.setSize(600, 400);
	frame.setVisible(true);
	
	layout.putConstraint(SpringLayout.WEST, nameLabel, 10, SpringLayout.WEST, contentPane);
    layout.putConstraint(SpringLayout.NORTH, nameLabel, 25, SpringLayout.NORTH, contentPane);
    layout.putConstraint(SpringLayout.NORTH, nameField, 25, SpringLayout.NORTH, contentPane);
    layout.putConstraint(SpringLayout.WEST, nameField, 60, SpringLayout.WEST, nameLabel); 
    
    layout.putConstraint(SpringLayout.WEST, productLabel, 10, SpringLayout.WEST, contentPane);
    layout.putConstraint(SpringLayout.NORTH, productLabel, 55, SpringLayout.NORTH, contentPane);
    layout.putConstraint(SpringLayout.NORTH, productField, 55, SpringLayout.NORTH, contentPane);
    layout.putConstraint(SpringLayout.WEST, productField, 60, SpringLayout.WEST, productLabel);
    
    layout.putConstraint(SpringLayout.WEST, priceLabel, 10, SpringLayout.WEST, contentPane);
    layout.putConstraint(SpringLayout.NORTH, priceLabel, 85, SpringLayout.NORTH, contentPane);
    layout.putConstraint(SpringLayout.NORTH, priceField, 85, SpringLayout.NORTH, contentPane);
    layout.putConstraint(SpringLayout.WEST, priceField, 60, SpringLayout.WEST, priceLabel);
    
    layout.putConstraint(SpringLayout.WEST, amountLabel, 10, SpringLayout.WEST, contentPane);
    layout.putConstraint(SpringLayout.NORTH, amountLabel, 115, SpringLayout.NORTH, contentPane);
    layout.putConstraint(SpringLayout.NORTH, amountField, 115, SpringLayout.NORTH, contentPane);
    layout.putConstraint(SpringLayout.WEST, amountField, 60, SpringLayout.WEST, amountLabel);
    
    layout.putConstraint(SpringLayout.WEST, submit, 70, SpringLayout.WEST, contentPane);
    layout.putConstraint(SpringLayout.NORTH, submit, 145, SpringLayout.NORTH, contentPane);
    ////
	
	//JPanel east = new JPanel();
	JFrame frameEast = new JFrame();
	Container contentPaneEast = frameEast.getContentPane();
	BoxLayout layoutEast = new BoxLayout(contentPaneEast,  BoxLayout.Y_AXIS);
	contentPaneEast.setLayout(layoutEast);
	//east.setLayout(new BoxLayout(east, BoxLayout.Y_AXIS));
	JButton mari = new JButton("Mari");

	contentPaneEast.add(mari);
	contentPaneEast.add(Box.createVerticalStrut(10));
	contentPaneEast.add(new JButton("Yunhai"));
	contentPaneEast.add(Box.createVerticalStrut(10));
	contentPaneEast.add(new JButton("Fido"));
	
	JPanel south = new JPanel();
	JLabel us = new JLabel("Lancellotti Wang - Super Couple");
	Font myFont = new Font("Arial", Font.CENTER_BASELINE, 10);
	us.setFont(myFont);
	south.add(us);
	
	
	BorderLayout layoutB = new BorderLayout();
	JFrame myFrame = new JFrame();
	
	super.setTitle("Gianluca superapp");
	myFrame.setLayout(layoutB);
	add(north, layoutB.NORTH);
	add(frame.getContentPane(), layoutB.CENTER);
	add(frameEast.getContentPane(), layoutB.EAST);
	add(south, layoutB.SOUTH);
	
	
	String nameRec = nameField.getText();

	//ActionListener actionListener = new Submit(nameField, productField, priceField, amountField);
	//submit.addActionListener(actionListener);
	
	}
	
	public static void main(String[] args) {
		
		Gui myGui = new Gui();
		myGui.setSize(400, 300);
		myGui.setDefaultCloseOperation(EXIT_ON_CLOSE);
		//myGui.setResizable(false);
		myGui.setVisible(true);
	}
}
