package function04;

import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test03Java {
	public static void main(String[] args) {		
		ApplicationContext context =
				new AnnotationConfigApplicationContext(SpringJavaConfig.class);
		
		String key1 = context.getMessage("key1", null, Locale.TAIWAN);
		System.out.println("key1="+key1);
		String key2 = context.getMessage("key2", new String[] {"A", "B", "C", "D"}, Locale.TAIWAN);
		System.out.println("key2="+key2);
		
		System.out.println("--------------------------------------------");
		
		String key11 = context.getMessage("key1", null, Locale.US);
		System.out.println("key11="+key11);
		String key22 = context.getMessage("key2", new String[] {"A", "B", "C", "D"}, Locale.US);
		System.out.println("key22="+key22);
		
		((ConfigurableApplicationContext) context).close();
	}
}
