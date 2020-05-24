package Lambdas;

public class LambdaMain {
	
	public static void main(String[] args) {
		
		//Creating a lambda expression
		LambdaInterface addTwoNumbers = (int a, int b) -> System.out.println(a + b);
		
		addTwoNumbers.addTwo(1, 2);
		
	}

}
