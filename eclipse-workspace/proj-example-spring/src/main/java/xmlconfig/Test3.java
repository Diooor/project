package xmlconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
	public static void main(String[] args) {
		ApplicationContext context =
				new ClassPathXmlApplicationContext("xmlconfig/beans.config-3.xml");
		
		DemoService3 demoService = (DemoService3) context.getBean("demoService");
		System.out.println("demoService="+demoService);

		DemoService3 demoService1 = (DemoService3) context.getBean("demoService1");
		System.out.println("demoService1="+demoService1);

		((ConfigurableApplicationContext) context).close();
	}
}
