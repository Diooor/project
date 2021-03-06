package function07;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		System.out.println("before ApplicationContext");
		ApplicationContext context =
				new ClassPathXmlApplicationContext("function07/beans.config.xml");
		System.out.println("after ApplicationContext");
		
		DemoBeanSingleton demoBeanSingleton11 = (DemoBeanSingleton) context.getBean("demoBeanSingleton");
		System.out.println("demoBeanSingleton11="+demoBeanSingleton11.hashCode());
		
		DemoBeanSingleton demoBeanSingleton12 = (DemoBeanSingleton) context.getBean("demoBeanSingleton");
		System.out.println("demoBeanSingleton12="+demoBeanSingleton12.hashCode());

		System.out.println("-------------------------------------------------");
		
		DemoBeanPrototype demoBeanPrototype21 = (DemoBeanPrototype) context.getBean("demoBeanPrototype");
		System.out.println("demoBeanPrototype21="+demoBeanPrototype21.hashCode());
		
		DemoBeanPrototype demoBeanPrototype22 = (DemoBeanPrototype) context.getBean("demoBeanPrototype");
		System.out.println("demoBeanPrototype22="+demoBeanPrototype22.hashCode());
		
		((ConfigurableApplicationContext) context).close();
	}
}
