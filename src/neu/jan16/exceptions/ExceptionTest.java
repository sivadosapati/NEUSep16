package neu.jan16.exceptions;

public class ExceptionTest {
	public static void main(String args[]) {
		System.out.println(sum(5, 7));
		try {
			System.out.println(divide(7, 2));
			System.out.println(divide(8, 0));
		} catch (Exception e) {
			System.out.println("Can't divide by 0");
		}
		System.out.println(sum(6, 5));
	}

	static int sum(int a, int b) {
		return a + b;
	}

	static int divide(int a, int b) {
		return a / b;
	}
}
