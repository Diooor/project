package util;

public class LogProviderB implements LogInterface {
	@Override
	public void log(String message) {
		System.out.println(System.currentTimeMillis()+"\tLogProviderB");
	}
}
