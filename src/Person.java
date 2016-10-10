
public class Person {
	public void eat(Chocolate c) {
		System.out.println("Eating Chocolate");
	}

	public void eat(Biscuit b) {
		System.out.println("Eating Biscuit");
	}

	public static void main(String args[]) {
		Person p = new Person();
		Chocolate c = new Chocolate();
		Biscuit b = new Biscuit();
		p.eat(b);
		p.eat(c);
	}
}

class Baby extends Person{
	public void eat(Chocolate c){
		super.eat(c);
		System.out.println("Make the whole place messy");
	}
}

class Chocolate {

}

class Biscuit {

}
