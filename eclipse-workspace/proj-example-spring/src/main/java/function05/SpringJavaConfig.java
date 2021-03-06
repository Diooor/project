package function05;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class SpringJavaConfig {
	@Bean
	public DemoClass1 demoClass1() {
		return new DemoClass1();
	}
	@Bean
	public DemoClass1 demo1() {
		return new DemoClass1();
	}
}
