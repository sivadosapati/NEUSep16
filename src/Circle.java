
public class Circle {
	double radius;

	Circle() {
		this(10d);
	}

	Circle(double r) {
		System.out.println("Double");
		this.radius = r;
	}

	Circle(int i) {
		System.out.println("Integer");
	}

	public static void main(String args[]) {
		new Circle();
	}
}
