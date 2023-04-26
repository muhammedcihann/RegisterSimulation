package RegisterSimulation.dataAccess.concretes;

import RegisterSimulation.dataAccess.abstracts.ICustomerDao;
import RegisterSimulation.entities.concretes.Customer;

public class MySQLCustomerDao implements ICustomerDao{

	@Override
	public void register(Customer customer) {
		
		System.out.println("Added User: " + customer.getName() + customer.getId());
		
	}

	@Override
	public boolean credentials(Customer customer) {
		if (customer.geteMail() != "muhammed.cihan@mfsociety.com" && customer.geteMail() != "furkanulutas@mfsociety.com") {
			System.out.println("Mail adress is not matched..");
			return true;
		}
		else {
			System.out.println("Mail has matched..");
			return false;
		}
		
	}

	@Override
	public void activateUser(Customer customer) {
		customer.setUserState(true); 
		System.out.println("User State Activated..");
	}

}
