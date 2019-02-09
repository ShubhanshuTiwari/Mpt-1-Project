import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.capgemini.beans.Customer;
import com.capgemini.repos.CustomerRepository;
import com.capgemini.repos.InMemoryCustomerRepository;

public class TestRepositoryOperations {

	CustomerRepository repository ;
	
	@Before
	public void setup(){
		repository = new InMemoryCustomerRepository();
	}
	
	
	@Test
	public void testCreateCustomerOperation() {
		// fail("Not yet implemented");

		Customer customer4 = new Customer();
		customer4.setFirstName("Roger");
		customer4.setLastName("Federer");
		
		repository.create(customer4);
		
		Customer customer5 = new Customer();
		customer5.setFirstName("Roger");
		customer5.setLastName("Federer");
		
		assertTrue(repository.findAll().contains(customer5));
	}

	@After
	public void tearDown(){
		repository = null;
	}
	
	
	
	
	
	
}
