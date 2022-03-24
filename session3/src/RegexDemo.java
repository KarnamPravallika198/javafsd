import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class RegexDemo {
    public static void main(String[] args) {
    	String pattern = "[A-Za-z]pp[A-Za-z]aat@";
    	Pattern p = Pattern.compile(pattern);
    	Matcher match = p.matcher("appbaat@");
    	System.out.println("Result "+match.matches());
    }
}
