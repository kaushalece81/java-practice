package com.java11.lambdaenhacement;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

// add validation-api-1.1.0.final.jar in class path

interface AddInterface1 {
	public int addTwoNumbers(int a, int b);

}

public class LambdaEnhancement {
	public static void main(String args[]) {
		beforeJava11();
		fromJava11();
	}
	private static void beforeJava11() {
		AddInterface1 addInterface1 = (  a, b) -> (a + b);
	
		int sum = addInterface1.addTwoNumbers(100, 200);
		System.out.println("beforeJava11 - Sum of two Numbers: " + sum);

		
	}
	private static void fromJava11() {
		AddInterface1 addInterface1 = (  var a, var b) -> (a + b);
		int sum1 = addInterface1.addTwoNumbers(100, 200);
		System.out.println("fromJava11 - Sum of two Numbers: " + sum1);
		//Change java compiler version to java 10 , you will get compilation error on the above line

		AddInterface1 addInterface2 = (final  var a, final var b) -> (a + b);
		int sum2 = addInterface2.addTwoNumbers(100, 200);
		System.out.println("fromJava11 - Sum of two Numbers: " + sum2);
		
		AddInterface1 addInterface3 = (@Min(value = 10, message = "Min value is incorrect, should be greater than 5.")  var a, @Max(value = 20, message = "Max value is incorrect, should be less than 20.") var b) -> (a + b);
		int sum3 = addInterface3.addTwoNumbers(3, 200);
		System.out.println("fromJava11 - Sum of two Numbers: " + sum3);
		
//		AddInterface1 addInterface4 = (@Nonnull var a, @Nullable var b) -> (a + b);
//		int sum4 = addInterface4.addTwoNumbers(null, 200);
//		System.out.println("fromJava11 - Sum of two Numbers: " + sum4);
	}

	 



}
