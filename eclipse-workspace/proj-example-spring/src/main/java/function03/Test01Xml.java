package function03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01Xml {
	public static void main(String[] args) {
		ApplicationContext context =
				new ClassPathXmlApplicationContext("function03/beans.config.xml");

		String string1 = (String) context.getBean("string1");
		System.out.println("string1="+string1);
		
		String string2 = (String) context.getBean("string2");
		System.out.println("string2="+string2);
		
		String string3 = (String) context.getBean("string3");
		System.out.println("string3="+string3);

		java.util.Date date1 = (java.util.Date) context.getBean("date1");
		System.out.println("date1="+date1);
		
		java.util.Date date2 = (java.util.Date) context.getBean("date2");
		System.out.println("date2="+date2);
		
		java.util.Date date3 = (java.util.Date) context.getBean("date3");
		System.out.println("date3="+date3);
		
		((ConfigurableApplicationContext) context).close();
	}
}
