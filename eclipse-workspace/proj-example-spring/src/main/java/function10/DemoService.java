package function10;

public class DemoService {
	public String method1(String param) {
		System.out.println("inside DemoService.method1()");
		long time = System.currentTimeMillis();
		return param+ ":"+ time;
	}
	public String method2(String param) {
		System.out.println("inside DemoService.method2()");
		java.util.Date time = new java.util.Date();
		return param+ ":"+ time;
	}
}
