import java.util.Scanner;

public class Calculator {
	int add(int a, int b) {
		int result = a + b;
		return result;
	}

	int difference(int a, int b) {
		int result = a - b;
		return result;
	}

	int multiply(int a, int b) {
		int result = a * b;
		return result;
	}

	int divide(int a, int b) {

		if (b == 0 && a == 0) {

		}
		if (b == 0 || a == 0) {

		}

		if (b > 10) {

		}
		if (b == 0) {
			System.out.println("Second number is 0. I can't divide by 0");
			return Integer.MIN_VALUE;
		}

		int result = a / b;
		return result;
	}

	public void operate(int a, int b, String operator) {
		char c = operator.charAt(0);
		if (c == '+') { //operator.equals("+")
			System.out.println(add(a, b));
			return;
		}
		if (c == '-') {
			System.out.println(difference(a, b));
			return;
		}
		System.out.println("I don't know the operator -> " + c);
	}

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first number");
		int a = scanner.nextInt();
		System.out.println("Enter second number");
		int b = scanner.nextInt();
		System.out.println("Enter the operator");
		String op = scanner.next();
		Calculator calculator = new Calculator();
		calculator.operate(a, b, op);

	}
}
