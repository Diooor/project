package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import util.LogInterface;
import util.LogProvider;

public class Test {
	public static void main(String[] args) {
	
//		LogInterface logger = new LogProvider();
//		logger.log("hahaha");
	
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.config.xml");
		LogInterface logger = (LogInterface)context.getBean("logInterface");
		logger.log("hahaha");
		
		((ConfigurableApplicationContext) context).close();
	}
}
