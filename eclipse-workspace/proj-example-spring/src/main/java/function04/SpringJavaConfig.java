package function04;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

@Configuration
class SpringJavaConfig {
	@Bean
	public MessageSource messageSource() {
		ResourceBundleMessageSource bundle = new ResourceBundleMessageSource();
		bundle.setBasename("function04.Message");
		return bundle;
	}
}
