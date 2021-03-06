package function06;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test02Java {
	public static void main(String[] args) {
		ApplicationContext context =
				new AnnotationConfigApplicationContext(SpringJavaConfig.class);

		DemoService demoService = (DemoService) context.getBean("demoService");
		System.out.println("demoService="+demoService);

		((ConfigurableApplicationContext) context).close();
	}
}
