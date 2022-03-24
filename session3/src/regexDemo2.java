import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class regexDemo2 {
    public static void main(String[] args) {
    	String pattern = "[A-Za-z0-9]{6}";
    	Pattern p = Pattern.compile(pattern);
    	Matcher matcher =  p.matcher("Praval");
    	System.out.println("Result: "+ matcher.matches());
    	/// Example 2
    	String pattern1 = "[789]{1}\\d{9}";
    	Pattern p1 = Pattern.compile(pattern1);
    	Matcher matcher1 = p1.matcher("9090989890");
    	System.out.println("Result: "+ matcher1.matches());
    	if(matcher1.matches()) {
    		System.out.println("Mobile number is valid");
    	}
    	else {
    		System.out.println("Mobile number is invalid");
    	}
    	String pattern2 = "[a-z]+";
    	Pattern p2 = Pattern.compile(pattern2);
    	String check = "Regular Expression";
    	Matcher matcher2 = p2.matcher(check);
    	while(matcher.find()) {
    		System.out.println(check.substring(matcher2.start(),matcher2.end()));
    	}
    }
}
