import static org.junit.Assert.*;

import org.junit.Test;

import com.cg.product.dao.IProductDAO;
import com.cg.product.dao.ProductDAO;
import com.cg.product.exception.ProductException;

public class ProductDAOimpl {
	IProductDAO productref=new ProductDAO();
	@Test
	public void test1() throws ProductException {
		//fail("Not yet implemented");
		int n=productref.updateProducts("soap", 10);
		boolean flag;
		if(n>0)
		flag=true;
		else
			flag=false;
		assertTrue(flag);
		
	}
	@Test
	public void test2() {
		//fail("Not yet implemented");
		
		
	}
	@Test
	public void test3() {
		//fail("Not yet implemented");
	}
	@Test
	public void test4() {
		//fail("Not yet implemented");
	}

}
