package TestNG_Annotations;

public class Theory {

/*
	Question :
		What is the importance of testng.xml file?
		In a Selenium TestNG project, we use testng.xml file to configure 
		the complete test suite in a single file. Some of the features are as follows.
		•   testng.xml file allows to include or exclude the execution of test methods and test groups
		•   It allows to pass parameters to the test cases
		•   Allows to add group dependencies
		•   Allows to add priorities to the test cases
		•   Allows to configure parallel execution of test cases
		•   Allows to parameterize the test cases

		Question 
		1. What is TestNG Assert and list out common TestNG Assertions?
		TestNG Asserts help us to verify the condition of the test in the middle of the test run. 
		Based on the TestNG Assertions, we will consider a successful test only 
		if it is completed the test run without throwing any exception.
		Some of the common assertions supported by TestNG are
		 
		•   assertEqual(String actual,String expected)
		•   assertEqual(String actual,String expected, String message)
		•   assertEquals(boolean actual,boolean expected)
		•   assertTrue(condition)
		•   assertTrue(condition, message)
		•   assertFalse(condition)
		•   assertFalse(condition, message)

		2. What is Hard Assert in TestNG?
		Hard Assert throws an AssertException immediately
		 when an assert statement fails and test suite continues with next @Test

		3.What is Soft Assert in TestNG?
		Soft Assert collects errors during @Test. 
		Soft Assert does not throw an exception when an assert fails 
		and would continue with the next step after the assert statement.
		If there is any exception and you want to throw it then you need to 
		use assertAll() method as a last statement in the @Test and test suite 
		again continue with next @Test as it is.
*/
}
