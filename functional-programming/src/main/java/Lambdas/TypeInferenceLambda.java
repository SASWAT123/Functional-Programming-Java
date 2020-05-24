package Lambdas;

public class TypeInferenceLambda {

	public static void main(String[] args) {
		
//		TypeInference stringLengthLambda = s -> s.length();
//		System.out.println(stringLengthLambda.getLength("Hello World"));
		
		getLength(s -> s.length());

	}
	
	public static void getLength(TypeInference stringLengthLambda) {
		System.out.println(stringLengthLambda.getLength("Hello World New"));
	}
	
	public interface TypeInference{
		int getLength(String s);
	}

}
