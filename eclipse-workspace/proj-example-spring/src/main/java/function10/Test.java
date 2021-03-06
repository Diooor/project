package function10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context =
				new ClassPathXmlApplicationContext("function10/beans.config.xml");

		DemoService demoService = (DemoService) context.getBean("demoService");
		System.out.println("=================================");
		String method1 = demoService.method1("hahaha");
		System.out.println("method1:"+method1);
		System.out.println("---------------------------------");
		String method2 = demoService.method2("hehehe");
		System.out.println("method2:"+method2);
		System.out.println("=================================");
		
		((ConfigurableApplicationContext) context).close();
	}
}
