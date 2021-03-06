package function08;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName=ConfigurableBeanFactory.SCOPE_SINGLETON)
public class DemoBeanJava {
	@PostConstruct
	public void method1() {
		System.out.println("calling DemoBeanJava.method1()");
	}
	@PreDestroy
	public void method2() {
		System.out.println("calling DemoBeanJava.method2()");
	}
	public DemoBeanJava() {
		System.out.println("create DemoBeanJava()");
	}
}
