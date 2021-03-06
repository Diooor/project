package function01;

public class LogProvider2 implements LogInterface {
	public void log(String message) {
		System.out.print("Log:"+message+":"+System.currentTimeMillis());
	}
}
