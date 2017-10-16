import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DeleteCutomerListener implements ActionListener {
	private String customer;
	private Model model;
	
	public DeleteCutomerListener(String customer, Model model) {
		this.customer = customer;
		this.model = model;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		model.deleteCustomer(customer);
		System.out.println("done");
		
	}
	
}
