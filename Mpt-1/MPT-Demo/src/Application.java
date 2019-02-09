import java.util.List;

import com.capgemini.beans.Customer;
import com.capgemini.service.CustomerService;
import com.capgemini.service.CustomerServiceImpl;

public class Application {
	public static void main(String[] args) {

		CustomerService service;

		service = new CustomerServiceImpl();

		List<Customer> customers = service.findAll();

		for (Customer customer : customers) {
			System.out.println(customer);
		}

		service.delete(101);
		customers = service.findAll();

		for (Customer customer : customers) {
			System.out.println(customer);
		}

		Customer customer4 = new Customer();
		customer4.setFirstName("Roger");
		customer4.setLastName("Federer");
		service.create(customer4);
		customers = service.findAll();
		
		for (Customer customer : customers) {
			System.out.println(customer);
		}
	}
}
