package com.cardtrick;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>AppTest</code> contains tests for the class <code>{@link App}</code>.
 *
 * @generatedBy CodePro at 12/16/14 3:50 PM
 * @author nishi_000
 * @version $Revision: 1.0 $
 */
public class AppTest {
	/**
	 * Run the String[] combine(String[],String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/16/14 3:50 PM
	 */
	@Test
	public void testCombine_1()
		throws Exception {
		String[] a = new String[] {};
		String[] b = new String[] {};

		String[] result = App.combine(a, b);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.length);
	}

	/**
	 * Run the void main(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/16/14 3:50 PM
	 */
	@Test
	public void testMain_1()
		throws Exception {
		String[] args = new String[] {};

		App.main(args);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Exit while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkExit(CodeProJUnitSecurityManager.java:57)
		//       at java.lang.Runtime.exit(Unknown Source)
		//       at java.lang.System.exit(Unknown Source)
		//       at com.cardtrick.util.UserInputUtil.readUserResponse(UserInputUtil.java:21)
		//       at com.cardtrick.App.main(App.java:59)
	}

	/**
	 * Run the void main(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/16/14 3:50 PM
	 */
	@Test
	public void testMain_2()
		throws Exception {
		String[] args = new String[] {};

		App.main(args);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Exit while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkExit(CodeProJUnitSecurityManager.java:57)
		//       at java.lang.Runtime.exit(Unknown Source)
		//       at java.lang.System.exit(Unknown Source)
		//       at com.cardtrick.util.UserInputUtil.readUserResponse(UserInputUtil.java:21)
		//       at com.cardtrick.App.main(App.java:59)
	}

	/**
	 * Run the void main(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/16/14 3:50 PM
	 */
	@Test
	public void testMain_3()
		throws Exception {
		String[] args = new String[] {};

		App.main(args);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Exit while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkExit(CodeProJUnitSecurityManager.java:57)
		//       at java.lang.Runtime.exit(Unknown Source)
		//       at java.lang.System.exit(Unknown Source)
		//       at com.cardtrick.util.UserInputUtil.readUserResponse(UserInputUtil.java:21)
		//       at com.cardtrick.App.main(App.java:59)
	}

	/**
	 * Run the void main(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/16/14 3:50 PM
	 */
	@Test
	public void testMain_4()
		throws Exception {
		String[] args = new String[] {};

		App.main(args);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Exit while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkExit(CodeProJUnitSecurityManager.java:57)
		//       at java.lang.Runtime.exit(Unknown Source)
		//       at java.lang.System.exit(Unknown Source)
		//       at com.cardtrick.util.UserInputUtil.readUserResponse(UserInputUtil.java:21)
		//       at com.cardtrick.App.main(App.java:59)
	}

	/**
	 * Run the void main(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/16/14 3:50 PM
	 */
	@Test
	public void testMain_5()
		throws Exception {
		String[] args = new String[] {};

		App.main(args);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Exit while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkExit(CodeProJUnitSecurityManager.java:57)
		//       at java.lang.Runtime.exit(Unknown Source)
		//       at java.lang.System.exit(Unknown Source)
		//       at com.cardtrick.util.UserInputUtil.readUserResponse(UserInputUtil.java:21)
		//       at com.cardtrick.App.main(App.java:59)
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 12/16/14 3:50 PM
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
	 * @generatedBy CodePro at 12/16/14 3:50 PM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 12/16/14 3:50 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(AppTest.class);
	}
}