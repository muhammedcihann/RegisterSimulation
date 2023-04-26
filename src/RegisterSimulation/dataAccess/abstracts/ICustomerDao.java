package RegisterSimulation.dataAccess.abstracts;

import RegisterSimulation.entities.concretes.Customer;

public interface ICustomerDao {
	void register(Customer customer);
	boolean credentials(Customer customer);
	void activateUser(Customer customer);
	
}
