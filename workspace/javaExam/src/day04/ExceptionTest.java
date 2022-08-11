package day04;

public class ExceptionTest {
	public static void main(String[] args) {
		int a = 0;
		double b;
		try {
			b = 100/a;
			System.out.println("Some more codes in try block");
		}
		catch(ArithmeticException e) {
			System.out.println("Exception occurred : "+e);
		}
		finally { 	//반드시 실행되는 코드 
			System.out.println("Some more codes in finally block");
		}
	}
}
