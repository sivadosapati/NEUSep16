package interfaces;

class B extends A {
	public static void print() {
		System.out.println("B -> print");
	}

	@Override
	public void prnt() {
		System.out.println("B -> prnt");
	}
}

public class A {
	public static void print() {
		System.out.println("A -> print");
	}

	public void prnt() {
		System.out.println("A -> prnt");
	}

	public static void main(String args[]) {
		A a = new A();
		B b = new B();
		A a1 = new B();
		a.prnt();
		b.prnt();
		a1.prnt();
		a.print();//A.print();
		b.print();//B.print();
		a1.print();//A.print();

	}
}
