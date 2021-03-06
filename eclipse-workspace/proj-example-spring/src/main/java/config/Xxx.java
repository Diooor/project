package config;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

@Configuration
public class Xxx {
	@Bean
	public MessageSource messageSource() {
		ResourceBundleMessageSource rbms = 
				new ResourceBundleMessageSource();
		rbms.setBasename("i18n.xxx");
		return rbms;
		
	}
}
