package model;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import configuration.config;
@RunWith(value = SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {config.class})
public class CustomerDAOJDBCTests {
	
	
	@Autowired
	private CustomerDAO customerDao;
		
	@Test
	public void slect() {
		CustomerBean bean = customerDao.select("Alex");
		System.out.println("bean"+bean);
		
		
	}

}