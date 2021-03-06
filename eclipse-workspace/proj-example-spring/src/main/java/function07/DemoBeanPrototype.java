package function07;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class DemoBeanPrototype {
	public DemoBeanPrototype() {
		System.out.println("----create function07.DemoBeanPrototype----");
	}
}
