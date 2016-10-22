package interfaces;

public class Person {
	static final Earth e = new Earth();

	String name;

	int sum(int a, int b) {
		System.out.println(name + " is calculating sum");
		return a + b;
	}
	
	final void speak(){
		
	}

	public static void digHoleInEarth() {
		e.digHole();
	}

	Person(String name) {
		System.out.println(name + " is born");
		this.name = name;
		e.birth();
		if (e.peopleCount % 2 == 0) {
			//e = null;
		}
	}

	public String toString() {
		return ("Total Number of People on Earth ->" + e.peopleCount);
	}

}

final class Male extends Person {
	Male(String name) {
		super(name);
	}
	

}



class Earth {
	int peopleCount;

	public void digHole() {
		System.out.println("Someone is digging hole on Earth");
	}

	Earth() {
		System.out.println("Earth is created");
	}

	void birth() {
		peopleCount++;
		System.out.println("Total # of People -> " + peopleCount);
	}
}