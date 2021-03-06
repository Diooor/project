package function01;

public class LogProvider1 implements LogInterface {
	public void log(String message) {
		System.out.print("Log:"+message+":"+new java.util.Date());
	}
}
