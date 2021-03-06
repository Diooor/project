package model;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import configuration.SpringJavaConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SpringJavaConfig.class})
public class CustomerServiceTests {
	@Autowired
	private CustomerService customerService;

	@Test
	public void testSelect() {
		CustomerBean login = customerService.login("Alex", "A");
		System.out.println("login="+login);	
	}
	
	@Test
	public void testUpdate() {
		boolean change = customerService.changePassword(
				"Ellen", "E", "EEE");
		System.out.println("change="+change);
	}
}
