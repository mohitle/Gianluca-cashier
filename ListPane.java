import javax.swing.*;
import java.awt.*;
import java.util.*;

/**
 * Pane showing the list of current customers.
 * @author Maria Grazia
 * @version 2 Oct 2017
 */

public class ListPane extends JPanel implements Observer {
	private Model model;
	private Box box;

	/**
	 * Constructor
	 * @param model
	 */
	public ListPane(Model model) {
		this.model = model;
		model.addObserver(this);
		setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.gray), "Your customers"));
		box = Box.createVerticalBox();
		add(box);
		
	}

	/**
	 * Buttons are added as new customers make orders.
	 */
	@Override
	public void update(Observable obs, Object obj) {
		box.removeAll();
		Set<String> l = model.listKeys();
		//System.out.println(l.toString());

		for (String e : l) {
			JButton b = new JButton(e);
			box.add(b);
			box.add(Box.createVerticalStrut(10));
			b.addActionListener(new Recap(e, model));
		}
		revalidate();
		repaint();
	}
}
