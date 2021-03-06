package model;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;

import configuration.SpringJavaConfig;

@Service
public class CustomerService {
	@Autowired
	private CustomerDAO customerDao;
	public static void main(String[] args) {
		ApplicationContext context =
				new AnnotationConfigApplicationContext(SpringJavaConfig.class);
		
		CustomerService customerService =
				(CustomerService) context.getBean("customerService");
		CustomerBean login = customerService.login("Alex", "A");
		System.out.println("login="+login);	
		
		boolean change = customerService.changePassword(
				"Ellen", "E", "EEE");
		System.out.println("change="+change);
		
		((ConfigurableApplicationContext) context).close();
	}
	public CustomerBean login(String username, String password) {
		CustomerBean bean = customerDao.select(username);
		if(bean!=null) {
			if(password!=null && password.length()!=0) {
				byte[] pass = bean.getPassword();
				byte[] temp = password.getBytes();
				if(Arrays.equals(pass, temp)) {
					return bean;
				}
			}
		}
		return null;
	}
	public boolean changePassword(String username, String oldPassword, String newPassword) {
		CustomerBean bean = this.login(username, oldPassword);
		if(bean!=null) {
			byte[] temp = newPassword.getBytes();
			return customerDao.update(temp, bean.getEmail(), bean.getBirth(), username);
		}
		return false;
	}
}
