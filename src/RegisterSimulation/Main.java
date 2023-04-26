package RegisterSimulation;

import RegisterSimulation.business.abstracts.ICustomerService;
import RegisterSimulation.business.concretes.CustomerManager;
import RegisterSimulation.dataAccess.concretes.MySQLCustomerDao;
import RegisterSimulation.entities.concretes.Customer;

public class Main {

	public static void main(String[] args) {
		Customer customer1 = new Customer(0, "Muhammed", "Cihan", "mhmdch@mfsociety.com", "123456", "mhmdchn", false);
		Customer customer2 = new Customer(1, "Furkan", "Ulutaş", "furkanulutas@mfsociety.com", "123456", "frknults", false);
		ICustomerService customerService = new CustomerManager(new MySQLCustomerDao());
		
		
		customerService.register(customer1);
		System.out.println(customer1.getUserState());
	}

}
