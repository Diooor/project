package function07;

import org.springframework.stereotype.Component;

@Component
public class DemoBeanSingleton {
	public DemoBeanSingleton() {
		System.out.println("----create function07.DemoBeanSingleton----");
	}
}
