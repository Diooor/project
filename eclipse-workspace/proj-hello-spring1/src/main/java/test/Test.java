package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import util.LogInterface;

public class Test {
	public static void main(String[] args) {
//		LogInterface logger = new LogProviderA();
//		LogInterface logger = new LogProviderB();
//		logger.log("hahaha");

		ApplicationContext context =
				new ClassPathXmlApplicationContext("beans.config.xml");

		LogInterface logger1 = (LogInterface) context.getBean("logProviderA");
		logger1.log("hahaha");
		
		((ConfigurableApplicationContext) context).close();
	}
}
