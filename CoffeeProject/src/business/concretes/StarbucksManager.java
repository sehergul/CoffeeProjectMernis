package business.concretes;

import business.abstracts.CustomerCheckService;

import entities.concretes.Customer;

public class StarbucksManager extends CustomerManager{
	
	private CustomerCheckService customerCheckService;
	
	public StarbucksManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;}

	
	@Override
	public void save(Customer customer) {
		if(customerCheckService.checkIfRealPerson(customer)==true)
			super.save(customer);
		else
			System.out.println("Not a valid person!");
	}

	
	
}
