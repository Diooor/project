package function10;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class LogAdvice {
	public void logBefore(JoinPoint point) {
        System.out.println("before : calling "+ point.getTarget().getClass()+"."+
        		point.getSignature().getName()+"() with argument "+ point.getArgs()[0]);
	}
	public Object logAround(ProceedingJoinPoint pPoint) throws Throwable {
		System.out.println("around : calling "+ pPoint.getTarget().getClass()+ "."
				+ pPoint.getSignature().getName()+ "() with argument "+ pPoint.getArgs()[0]);
		Object result = pPoint.proceed();		//執行JointPoint
		System.out.println("around : result="+ result);
		return result+"經過加工後的回傳值";
	}
	public void logAfterReturning(JoinPoint point, Object result) {
		System.out.println("after returning : result="+ result);
	}
}
