package function01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"function01/beans.config.xml");

		LogInterface logger1 = (LogInterface) context.getBean("logProvider1");
		logger1.log("Step 1");

//		LogInterface logger2 = (LogInterface) context.getBean("logProvider2");
//		logger2.log("Step 2");
		
		((ConfigurableApplicationContext) context).close();
	}
}
