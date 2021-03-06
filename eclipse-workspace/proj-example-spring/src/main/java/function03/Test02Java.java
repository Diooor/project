package function03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test02Java {
	public static void main(String[] args) {
		ApplicationContext context =
				new AnnotationConfigApplicationContext(SpringJavaConfig.class);

		java.util.Date date1 = (java.util.Date) context.getBean("date1");
		System.out.println("date1="+date1);
		
		((ConfigurableApplicationContext) context).close();
	}
}
