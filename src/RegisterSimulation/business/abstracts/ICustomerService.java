package RegisterSimulation.business.abstracts;

import RegisterSimulation.entities.concretes.Customer;

public interface ICustomerService {
	void login(Customer customer);
	void register(Customer customer);
	boolean checkPassword(Customer customer);
	boolean checkEmailFormat(Customer customer);
	boolean checkEmail(Customer customer);
	boolean checkNameFormat(Customer customer);
	void sentEmailVertification(Customer customer);
	
	
}
