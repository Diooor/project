package model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.config.xml");
		LogInterface logger = (LogInterface) context.getBean("logProvider");
		logger.log("Step1");
		((ConfigurableApplicationContext) context).close();
	}
}
