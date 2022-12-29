package TestNG_Features;

import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class Keyword6 {
	
/* Question: If you want to handle exception without using try catch block so how will you handle it. 
 
 Ans.  By using (expectedExceptions = ArithmeticException.class)	
 */

	@Test (expectedExceptions = ArithmeticException.class)
	public void Test1() {
		System.err.println("Handle Exception");
		int i =10/0;    //Exception occurs
		System.out.println("Hello");
	}
	
}
