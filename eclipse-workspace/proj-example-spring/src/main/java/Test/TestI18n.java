package Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class TestI18n {
	public static void main(String[] args) {
		ApplicationContext context = 
				new AnnotationConfigApplicationContext(config.Xxx.class);
		
//		MessageSource messageSource = (MessageSource) context.getBean("ooo");
		String demo = context.getMessage("demo", new String[] {"AAA", "BBB", "CCC"}, null);
		System.out.println("demo="+demo);
		((ConfigurableApplicationContext) context).close();
		
	}
}
