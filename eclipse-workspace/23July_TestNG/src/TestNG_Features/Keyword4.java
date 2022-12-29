package TestNG_Features;

import org.testng.annotations.Test;

public class Keyword4 {
	
// TestNG keyword-4: "invocationCount" 
	/* Sometimes some test method/TC need to be executed multiple which can be possible by using NestNG keyword "invocationCount"
	   Example: invocationCount= 10; */
	
	@Test (invocationCount = 5)
	public void Test() {
		int a= 20;
		int b= 10;
		int c=a+b;
		System.out.println("Sum of a & b : "+c);
	}

}
