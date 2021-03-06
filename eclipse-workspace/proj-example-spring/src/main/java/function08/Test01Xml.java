package function08;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01Xml {
	public static void main(String[] args) {
		ApplicationContext context =
				new ClassPathXmlApplicationContext("function08/beans.config-xml.xml");
		System.out.println("----------Application Context created----------");
		
		DemoBeanXml demoBeanXml = (DemoBeanXml) context.getBean("demoBeanXml");
		System.out.println("demoBeanXml="+demoBeanXml);
		
		((ConfigurableApplicationContext) context).close();
	}
}
