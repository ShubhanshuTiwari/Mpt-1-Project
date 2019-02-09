import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.capgemini.repos.CustomerRepository;
import com.capgemini.repos.InMemoryCustomerRepository;

public class TestStringOperations {

	private CustomerRepository repository;

	@Before
	public void setup() {
		System.out.println("setting up the repository");
		repository = new InMemoryCustomerRepository();
	}

	@Test
	public void testFindAllCustomers() {
		int size = repository.findAll().size();

		assertEquals(4, size);
	}

	@After
	public void tearDown() {
		System.out.println("tearing down the repository");
		repository = null;
	}

	
	
	@Test
//	@Ignore
	public void test() {
		// fail("Not yet implemented");

		String message = "Hello, world!";
		String message2 = new String("Hello, world!");
		message = null;

		assertTrue(message.length() > 0);
		assertEquals(message2, message);
		assertSame(message2, message);

	}

}
