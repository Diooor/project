package function02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void noSpring() {
//coupling high
		DemoService demoService0 = new DemoService();

//coupling low : constructor
		DemoDAO demoDao1 = new DemoDAO();
		DemoService1 demoService1 = 
				new DemoService1(demoDao1);
		
//coupling low : setter
		DemoDAO demoDao2 = new DemoDAO();
		DemoService2 demoService2 =
				new DemoService2();
		demoService2.setDemoDao(demoDao2);
	}
	public static void main(String[] args) {
		spring();
	}
	public static void spring() {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"function02/beans.config.xml");

		DemoService1 d1 = (DemoService1) context.getBean("d1");

		DemoService1 demoService1 = (DemoService1) context.getBean("demoService1");
		DemoService2 demoService2 = (DemoService2) context.getBean("demoService2");

		((ConfigurableApplicationContext) context).close();
	}
}
