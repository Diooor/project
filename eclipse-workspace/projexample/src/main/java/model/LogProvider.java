package model;

public class LogProvider implements LogInterface{
	public void log(String message) {
		System.out.println(message);
	}

}
