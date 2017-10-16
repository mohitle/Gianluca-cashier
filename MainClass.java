import javax.swing.*;
import java.awt.*;
import java.util.*;

/**
 * View class. Panes are assembled to show the main window. Model is initialised.
 * @author Maria Grazia
 * @version 2 Oct 2017
 */
public class MainClass { 
	
	public static void main(String[] args) {
				
		Map<String, ArrayList<String>> listOfOrders = new HashMap<String, ArrayList<String>>();
		Order o = new Order(listOfOrders);
		Model model = new Model(o);
		
		JFrame frame = new JFrame();
		frame.setLayout(new BorderLayout());

		FormPane formPane = new FormPane(model);
		ListPane listPane = new ListPane(model);
		
		JLabel welcomeLabel = new JLabel("Welcome Gianluca!");
		welcomeLabel.setHorizontalAlignment(JLabel.CENTER);
						
		frame.add(welcomeLabel, BorderLayout.PAGE_START);
		frame.add(formPane, BorderLayout.CENTER);
		frame.add(listPane, BorderLayout.PAGE_END);
		
		frame.setSize(280, 400);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
	}	
}