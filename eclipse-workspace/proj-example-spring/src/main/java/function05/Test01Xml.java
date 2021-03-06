package function05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01Xml {
	public static void main(String[] args) {
		ApplicationContext context =
				new ClassPathXmlApplicationContext("function05/beans.config.xml");
		
		DemoClass1 demoClass1 = (DemoClass1) context.getBean("demoClass1");
		System.out.println("demoClass1="+demoClass1);

		DemoClass2 demoClass2 = (DemoClass2) context.getBean("demo2");
		System.out.println("demoClass2="+demoClass2);

		((ConfigurableApplicationContext) context).close();
	}
}
