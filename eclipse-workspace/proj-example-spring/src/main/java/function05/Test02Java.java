package function05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test02Java {
	public static void main(String[] args) {
		ApplicationContext context =
				new AnnotationConfigApplicationContext(SpringJavaConfig.class);
		
		DemoClass1 demoClass1 = (DemoClass1) context.getBean("demoClass1");
		System.out.println("demoClass1="+demoClass1);

		DemoClass1 demo1 = (DemoClass1) context.getBean("demo1");
		System.out.println("demo1="+demo1);

		((ConfigurableApplicationContext) context).close();
	}
}
