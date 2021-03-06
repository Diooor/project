package xmlconfig;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoBean2 {
	private String field1 = "this is xmlconfig.DemoBean2";
	public DemoBean2(String field1) {
		this.field1 = field1;
	}
	
	private java.util.Date field2;
	public DemoBean2(Date field2) {
		this.field2 = field2;
	}
	
	private List<String> field3;
	public DemoBean2(List<String> field3) {
		this.field3 = field3;
	}
	
	private Map<String, String> field4;
	public DemoBean2(Map<String, String> field4) {
		this.field4 = field4;
	}
	
	private Properties field5;
	public DemoBean2(Properties field5) {
		this.field5 = field5;
	}
	
	@Override
	public String toString() {
		return "DemoBean2 [field1=" + field1 + ", field2=" + field2 + ", "
				+ "field3=" + field3 + ", field4=" + field4	+ ", field5=" + field5 + "]";
	}
	public static void main(String[] args) {
		ApplicationContext context =
				new ClassPathXmlApplicationContext("xmlconfig/beans.config-2.xml");

		DemoBean2 demoBean1 = (DemoBean2) context.getBean("demoBean1");
		System.out.println("demoBean1="+demoBean1);
		
		DemoBean2 demoBean2 = (DemoBean2) context.getBean("demoBean2");
		System.out.println("demoBean2="+demoBean2);
		
		DemoBean2 demoBean3 = (DemoBean2) context.getBean("demoBean3");
		System.out.println("demoBean3="+demoBean3);	
		
		DemoBean2 demoBean4 = (DemoBean2) context.getBean("demoBean4");
		System.out.println("demoBean4="+demoBean4);	

		DemoBean2 demoBean5 = (DemoBean2) context.getBean("demoBean5");
		System.out.println("demoBean5="+demoBean5);	

		DemoBean2 demoBean6 = (DemoBean2) context.getBean("demoBean6");
		System.out.println("demoBean6="+demoBean6);	
		
		((ConfigurableApplicationContext) context).close();
	}
}
