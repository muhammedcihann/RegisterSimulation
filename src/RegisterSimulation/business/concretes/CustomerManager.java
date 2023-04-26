package RegisterSimulation.business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import RegisterSimulation.business.abstracts.ICustomerService;
import RegisterSimulation.dataAccess.abstracts.ICustomerDao;
import RegisterSimulation.entities.concretes.Customer;

public class CustomerManager implements ICustomerService{
	ICustomerDao customerDao;
	public CustomerManager() {}
	public CustomerManager(ICustomerDao customerDao) {
		super();
		this.customerDao = customerDao;
		}

	String emailRegex = "^([A-Za-z0-9*-_])+((@mfsociety){1})((.){1})(com{1})$";
	
	@Override
	public void login(Customer customer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void register(Customer customer) {
		if(checkPassword(customer)== true) {
			if(checkEmailFormat(customer)==true) {
				if(checkEmail(customer)==true) {
					if(checkNameFormat(customer)==true) {
						this.sentEmailVertification(customer);
						this.customerDao.register(customer);
						
					}
				}
			}
		}
		
	}

	@Override
	public boolean checkPassword(Customer customer) {
		if(customer.getPassword().length() < 6) {
			System.out.println("Password must be more than 6 ch..");
			return false;
		}
		else {
			
			return true;
		}
	}

	@Override
	public boolean checkEmailFormat(Customer customer) {
		Pattern pattern = Pattern.compile(emailRegex);
		Matcher matcher = pattern.matcher(customer.geteMail());
		if(matcher.matches()) {
			return true;
		}
		else {
			System.out.println("Please Enter Email Format..");
			return false;
		}
		
	}

	@Override
	public boolean checkEmail(Customer customer) {
		if(this.customerDao.credentials(customer)) {
			return true;
		}
		else {
			System.out.println("This email has already taken..");
			return false;
		}
	}

	@Override
	public boolean checkNameFormat(Customer customer) {
		if(customer.getName().length() <= 2 ) {
			System.out.println("Name must be more than 2 ch..");
			return false;
		}
		else if (customer.getLastName().length() <= 2) {
			System.out.println("Lastname must be more than 2 ch..");
			return false;
			
		}
		else {
			return true;
		}
		
	}

	@Override
	public void sentEmailVertification(Customer customer) {
		System.out.println("Mail has been sent");
		this.customerDao.activateUser(customer);
		
	}

}
