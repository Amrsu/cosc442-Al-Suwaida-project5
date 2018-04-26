	import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class JamesBond {

	public static Boolean bondRegex(String input) {
		Pattern pattern = Pattern.compile(".*( 007 ).*");
		Matcher matcher = pattern.matcher(input);
				
				return matcher.find();
		
	}

}
