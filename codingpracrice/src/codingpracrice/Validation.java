package codingpracrice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {
	public static boolean validateName(String name) {
		String regex ="[A-Za-z]{5,}";
		Pattern pattern = Pattern.compile(regex);
		 Matcher matcher = pattern.matcher(name);
	        return matcher.matches();
	    }
	public static boolean validateAccount(String accountNo) {
		String regex ="^[1-9][0-9]{11}$";
		Pattern pattern = Pattern.compile(regex);
		 Matcher matcher = pattern.matcher(accountNo);
	        return matcher.matches();
	    }
	public static boolean validateIfsc(String IFSC) {
		String regex ="^[A-Z]{4}0[0-9]{6}$";
		Pattern pattern = Pattern.compile(regex);
		 Matcher matcher = pattern.matcher(IFSC);
	        return matcher.matches();
	    }
}
