package function04;

import java.util.Locale;
import java.util.ResourceBundle;

public class Test01NoSpring {
	public static void main(String[] args) {
		ResourceBundle bundle1 =
				ResourceBundle.getBundle("function04.Message", Locale.US);
		String key1 = bundle1.getString("key1");
		System.out.println("key1="+key1);
		String key2 = bundle1.getString("key2");
		System.out.println("key2="+key2);
		
		System.out.println("-----------------------");
		
		ResourceBundle bundle2 =
				ResourceBundle.getBundle("function04.Message", Locale.TAIWAN);
		String key11 = bundle2.getString("key1");
		System.out.println("key11="+key11);
		String key22 = bundle2.getString("key2");
		System.out.println("key22="+key22);
	}
}
