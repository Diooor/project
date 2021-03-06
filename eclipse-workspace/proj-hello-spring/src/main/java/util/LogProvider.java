package util;


public class LogProvider implements LogInterface{

	@Override
	public void log(String message) {
		System.out.print(message);
		
	}
	
}