package model.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import configuration.SpringJavaConfig;
import model.CustomerBean;
import model.CustomerDAO;

@RunWith(value = SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SpringJavaConfig.class})
public class CustomerDAOJdbcTests {
	@Autowired
	private CustomerDAO customerDao;

	@Test
	public void testSelect() {
		CustomerBean bean = customerDao.select("Babe");
		System.out.println("bean="+bean);
	}
	
	@Test
	public void testUpdate() {
		boolean result = customerDao.update("E".getBytes(),
				"ellen@lab.com", new java.util.Date(0), "Ellen");
		System.out.println("result="+result);
	}
}
