package Logical.Program;

public class FibonacciSeries {

	public static void main(String[] args) {

		// Que. Write a program on factorial number
		
				int num = 5;   // 5*4*3*2*1    // Last num & first num declare
				int fact = 1;
				
				for (int i=num; i>=1; i--) {
					// i=5
					// i=4
					// i=3
					// i=2
					// i=1 
					fact = fact*i;
					// fact = 1*5*4*3*2*1
				
				}
				
				System.out.println("Factorial of given Number: "+fact);
			}

	}

