package function08;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test02Xml {
	public static void main(String[] args) {
		ApplicationContext context =
				new ClassPathXmlApplicationContext("function08/beans.config-java.xml");
		System.out.println("----------Application Context created----------");
		
		DemoBeanJava demoBeanJava = (DemoBeanJava) context.getBean("demoBeanJava");
		System.out.println("demoBeanJava="+demoBeanJava);

		((ConfigurableApplicationContext) context).close();
	}
}
