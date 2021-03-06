package function03;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class SpringJavaConfig {
	@Bean
	public String string1() {
		return new String("this is a string");
	}
	
	@Bean
	public java.util.Date date3() {
		java.util.Date data = new java.util.Date(0L);
		data.setMonth(10);
		return data;
	}
	
	@Bean
	public java.util.Date date1() {
		return new java.util.Date();
	}
}
