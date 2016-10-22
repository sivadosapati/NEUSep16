package interfaces;

public class PassingValues {
	public int sum(int a, int b) {
		a = a + 10;
		b = b + 10;
		return a + b;
	}

	public int sum(Number a, Number b) {
		a.value = a.value + 10;
		b.value = b.value + 10;
		return a.value + b.value;
	}

	public static void main(String args[]) {
		PassingValues pv = new PassingValues();
		int a = 10;
		int b = 5;
		System.out.println(pv.sum(a, b));
		System.out.println(a);
		System.out.println(b);
		System.out.println("------");

		Number na = new Number();
		na.value = 10;
		Number nb = new Number();
		nb.value = 5;
		System.out.println(pv.sum(na, nb));
		System.out.println(na.value);
		System.out.println(nb.value);
	}
}

class Number {
	int value;
}
