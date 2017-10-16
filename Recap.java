import java.awt.event.*;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import javax.swing.*;

/**
 * Listener for customers' list buttons. Each customer's orders are shown in a table with products and amount.
 * Frame gets updated automatically as a customer makes new orders.
 * @author Maria Grazia
 * @version 3 Oct 2017
 */


public class Recap implements ActionListener, Observer {
	private Model model;
	private String customer;
	private JFrame f = new JFrame();

	/**
	 * Constructor
	 * @param customer name
	 * @param model
	 */
	public Recap(String customer, Model model) {
		this.customer = customer;
		this.model = model;
		this.model.addObserver(this);
	}

	/**
	 * Getting data for current customer from the model and displaying info in a table.
	 */
	@Override
	public void actionPerformed(ActionEvent arg0) {
		BoxLayout layout = new BoxLayout(f.getContentPane(), BoxLayout.Y_AXIS);
		f.setLayout(layout);
		f.setTitle(customer);
		f.setSize(350, 280);
		
		ArrayList<String> al = model.valuesPerCustomer(customer);

		String[] columnNames = {"Product", "Amount"};
		String[][] data = new String[al.size() / 2][2];

		int counter = 0;
		for (int row = 0; row < al.size()/2; row++){
			for (int col = 0; col < 2; col++){
				data[row][col] = al.get(counter);
				counter++;
			}
		}
		
		JTable table = new JTable(data, columnNames);
		JScrollPane scrollPane = new JScrollPane(table);
		table.setFillsViewportHeight(true);
		
		f.add(scrollPane);
		//JButton done = new JButton("Delete customer");
		//f.add(done);
	//	done.addActionListener(new DeleteCutomerListener(customer, model));
		//done.setAlignmentX(done.CENTER_ALIGNMENT);
		f.setVisible(true);
		
		
	}

	@Override
	public void update(Observable o, Object arg) {
		
		f.getContentPane().removeAll();
		
		ArrayList<String> al = model.valuesPerCustomer(customer);
		
		String[] columnNames = {"Product", "Amount"};
		String[][] data = new String[al.size() / 2][2];

		int counter = 0;
		for (int row = 0; row < al.size()/2; row++){
			for (int col = 0; col < 2; col++){
				data[row][col] = al.get(counter);
				counter++;
			}
		}
		
		JTable table = new JTable(data, columnNames);
		JScrollPane scrollPane = new JScrollPane(table);
		table.setFillsViewportHeight(true);
		f.add(scrollPane);
		f.revalidate();

		f.repaint();
	}
}
 