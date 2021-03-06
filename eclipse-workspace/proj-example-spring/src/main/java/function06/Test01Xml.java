package function06;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01Xml {
	public static void main(String[] args) {
		ApplicationContext context =
				new ClassPathXmlApplicationContext("function06/beans.config.xml");

		DemoService demoService = (DemoService) context.getBean("demoService");
		System.out.println("demoService="+demoService);
		
		((ConfigurableApplicationContext) context).close();
	}
}
