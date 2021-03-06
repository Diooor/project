package function02;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class Xxx {

	@Bean
	public DemoDAO demoDao() {
		return new DemoDAO();
	}
	
	@Bean
	public DemoService1 demoService1() {
		return new DemoService1(demoDao());
	}
	
	
}
