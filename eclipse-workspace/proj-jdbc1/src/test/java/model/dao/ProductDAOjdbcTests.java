package model.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import configuration.SpringJavaConfig;
import model.CustomerBean;
import model.CustomerDAO;
import model.ProductBean;
import model.ProductDAO;

@RunWith(value = SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SpringJavaConfig.class})
public class ProductDAOjdbcTests {
	@Autowired
	private ProductDAO productDao;
	@Test
	public void testSelect() {
		ProductBean bean = productDao.select(1);
		System.out.println("bean="+bean);
	}

}
