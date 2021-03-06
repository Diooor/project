package Test;

import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestI18nXml {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.config.xml");
		String key = context.getMessage("key", null, Locale.TAIWAN);
		System.out.println("key"+key);
		((ConfigurableApplicationContext) context).close(); 
	}
	
	

}
