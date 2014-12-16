package com.cardtrick.validator;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>AppValidatorTest</code> contains tests for the class <code>{@link AppValidator}</code>.
 *
 * @generatedBy CodePro at 12/16/14 3:49 PM
 * @author nishi_000
 * @version $Revision: 1.0 $
 */
public class AppValidatorTest {
	/**
	 * Run the boolean validateResponse(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/16/14 3:49 PM
	 */
	@Test
	public void testValidateResponse_1()
		throws Exception {
		String response = "";

		boolean result = AppValidator.validateResponse(response);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Exit while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkExit(CodeProJUnitSecurityManager.java:57)
		//       at java.lang.Runtime.exit(Unknown Source)
		//       at java.lang.System.exit(Unknown Source)
		//       at com.cardtrick.util.UserInputUtil.readUserResponse(UserInputUtil.java:21)
		//       at com.cardtrick.validator.AppValidator.validateResponse(AppValidator.java:12)
		assertTrue(result);
	}

	/**
	 * Run the boolean validateResponse(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/16/14 3:49 PM
	 */
	@Test
	public void testValidateResponse_2()
		throws Exception {
		String response = "";

		boolean result = AppValidator.validateResponse(response);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Exit while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkExit(CodeProJUnitSecurityManager.java:57)
		//       at java.lang.Runtime.exit(Unknown Source)
		//       at java.lang.System.exit(Unknown Source)
		//       at com.cardtrick.util.UserInputUtil.readUserResponse(UserInputUtil.java:21)
		//       at com.cardtrick.validator.AppValidator.validateResponse(AppValidator.java:12)
		assertTrue(result);
	}

	/**
	 * Run the boolean validateResponse(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/16/14 3:49 PM
	 */
	@Test
	public void testValidateResponse_3()
		throws Exception {
		String response = "";

		boolean result = AppValidator.validateResponse(response);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Exit while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkExit(CodeProJUnitSecurityManager.java:57)
		//       at java.lang.Runtime.exit(Unknown Source)
		//       at java.lang.System.exit(Unknown Source)
		//       at com.cardtrick.util.UserInputUtil.readUserResponse(UserInputUtil.java:21)
		//       at com.cardtrick.validator.AppValidator.validateResponse(AppValidator.java:12)
		assertTrue(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 12/16/14 3:49 PM
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
	 * @generatedBy CodePro at 12/16/14 3:49 PM
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
	 * @generatedBy CodePro at 12/16/14 3:49 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(AppValidatorTest.class);
	}
}