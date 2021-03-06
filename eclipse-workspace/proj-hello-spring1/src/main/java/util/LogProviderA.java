package util;

public class LogProviderA implements LogInterface {
	@Override
	public void log(String message) {
		System.out.println(new java.util.Date()+"\tLogProviderA");
	}
}
