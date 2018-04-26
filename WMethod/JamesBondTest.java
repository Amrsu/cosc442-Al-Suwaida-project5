import org.junit.*;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

/**
 * The class <code>JamesBondTest</code> contains tests for the class <code>{@link JamesBond}</code>.
 *
 * @generatedBy CodePro at 4/23/18 10:32 PM
 * @author am
 * @version $Revision: 1.0 $
 */
public class JamesBondTest {
	/**
	 * Run the Boolean bondRegex(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/18 10:32 PM
	 */
	@Test
	public void testBondRegex_1()
		throws Exception {
		JamesBond fixture = new JamesBond();
		String input = "";

		Boolean result = fixture.bondRegex(input);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.util.regex.PatternSyntaxException: Dangling meta character '*' near index 6
		//       \d  *(*007*)* \d
		//       ^
		//       at java.util.regex.Pattern.error(Pattern.java:1955)
		//       at java.util.regex.Pattern.sequence(Pattern.java:2123)
		//       at java.util.regex.Pattern.expr(Pattern.java:1996)
		//       at java.util.regex.Pattern.group0(Pattern.java:2905)
		//       at java.util.regex.Pattern.sequence(Pattern.java:2051)
		//       at java.util.regex.Pattern.expr(Pattern.java:1996)
		//       at java.util.regex.Pattern.compile(Pattern.java:1696)
		//       at java.util.regex.Pattern.<init>(Pattern.java:1351)
		//       at java.util.regex.Pattern.compile(Pattern.java:1028)
		//       at JamesBond.bondRegex(JamesBond.java:7)
		assertNotNull(result);
	}

	/**
	 * Run the Boolean bondRegex(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/18 10:32 PM
	 */
	@Test
	public void testBondRegex_2()
		throws Exception {
		JamesBond fixture = new JamesBond();
		String input = "(";

		Boolean result = fixture.bondRegex(input);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.util.regex.PatternSyntaxException: Dangling meta character '*' near index 6
		//       \d  *(*007*)* \d
		//       ^
		//       at java.util.regex.Pattern.error(Pattern.java:1955)
		//       at java.util.regex.Pattern.sequence(Pattern.java:2123)
		//       at java.util.regex.Pattern.expr(Pattern.java:1996)
		//       at java.util.regex.Pattern.group0(Pattern.java:2905)
		//       at java.util.regex.Pattern.sequence(Pattern.java:2051)
		//       at java.util.regex.Pattern.expr(Pattern.java:1996)
		//       at java.util.regex.Pattern.compile(Pattern.java:1696)
		//       at java.util.regex.Pattern.<init>(Pattern.java:1351)
		//       at java.util.regex.Pattern.compile(Pattern.java:1028)
		//       at JamesBond.bondRegex(JamesBond.java:7)
		assertNotNull(result);
	}
	
	@Test
	public void testBondRegex_3(){
		assertFalse(JamesBond.bondRegex("("));
		
	}

	@Test
	public void testBondRegex_4(){
		assertFalse(JamesBond.bondRegex(")"));
		
	}
	@Test
	public void testBondRegex_5(){
		assertFalse(JamesBond.bondRegex("0"));
		
	}
	@Test
	public void testBondRegex_6(){
		assertFalse(JamesBond.bondRegex("7"));
		
	}
	@Test
	public void testBondRegex_7(){
		assertFalse(JamesBond.bondRegex("(00"));
		
	}
	
	@Test
	public void testBondRegex_8(){
		assertFalse(JamesBond.bondRegex("(007"));
		
	}
	
	@Test
	public void testBondRegex_9(){
		assertFalse(JamesBond.bondRegex("007"));
		
	}
	
	@Test
	public void testBondRegex_10(){
		assertFalse(JamesBond.bondRegex("(007)"));
		
	}
	
	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/23/18 10:32 PM
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 4/23/18 10:32 PM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	
}