package function09;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAdvice {
	@Pointcut(value="execution (* function09.DemoService.method1(..) )")
	private void pointcut() {
		
	}
	@Before("pointcut()")
	public void logBefore(JoinPoint point) {
        System.out.println("before : calling "+ point.getTarget().getClass()+"."+
        		point.getSignature().getName()+"() with argument "+ point.getArgs()[0]);
	}
	@Around("pointcut()")
	public Object logAround(ProceedingJoinPoint pPoint) throws Throwable {
		System.out.println("around : calling "+ pPoint.getTarget().getClass()+ "."
				+ pPoint.getSignature().getName()+ "() with argument "+ pPoint.getArgs()[0]);
		Object result = pPoint.proceed();		//執行JointPoint
		System.out.println("around : result="+ result);
		return result+"經過加工後的回傳值";
	}
	@AfterReturning(pointcut="pointcut()", returning="result")
	public void logAfterReturning(JoinPoint point, Object result) {
		System.out.println("after returning : result="+ result);
	}
}
