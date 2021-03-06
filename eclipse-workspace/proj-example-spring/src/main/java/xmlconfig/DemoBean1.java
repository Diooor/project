package xmlconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoBean1 {
	private String field1;
	public DemoBean1(String field1) {
		this.field1 = field1;
	}
	private int field2;
	public DemoBean1(int field2) {
		this.field2 = field2;
	}
	public DemoBean1(String field1, int field2) {
		this.field1 = field1;
		this.field2 = field2;
	}
	public DemoBean1() {
		
	}
	public void setField1(String field1) {
		this.field1 = field1;
	}
	public void setField2(int field2) {
		this.field2 = field2;
	}
	@Override
	public String toString() {
		return "DemoBean1 [field1=" + field1 + ", field2=" + field2 + "]";
	}
	public static void main(String[] args) {
		ApplicationContext context =
				new ClassPathXmlApplicationContext("xmlconfig/beans.config-1.xml");

		DemoBean1 demoBean1 = (DemoBean1) context.getBean("demoBean1");
		System.out.println("demoBean1="+demoBean1);
		
		DemoBean1 demoBean2 = (DemoBean1) context.getBean("demoBean2");
		System.out.println("demoBean2="+demoBean2);

		DemoBean1 demoBean3 = (DemoBean1) context.getBean("demoBean3");
		System.out.println("demoBean3="+demoBean3);
		
		DemoBean1 demoBean4 = (DemoBean1) context.getBean("demoBean4");
		System.out.println("demoBean4="+demoBean4);
		
		DemoBean1 demoBean5 = (DemoBean1) context.getBean("demoBean5");
		System.out.println("demoBean5="+demoBean5);
		
		DemoBean1 demoBean6 = (DemoBean1) context.getBean("demoBean6");
		System.out.println("demoBean6="+demoBean6);
		
		DemoBean1 demoBean7 = (DemoBean1) context.getBean("demoBean7");
		System.out.println("demoBean7="+demoBean7);
		
		DemoBean1 demoBean8 = (DemoBean1) context.getBean("demoBean8");
		System.out.println("demoBean8="+demoBean8);
		
		DemoBean1 demoBean9 = (DemoBean1) context.getBean("demoBean9");
		System.out.println("demoBean9="+demoBean9);
		
		((ConfigurableApplicationContext) context).close();
	}
}
