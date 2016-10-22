package interfaces;

public class Event {
	public void sitOnChair(Student s) {

	}

	public void sitOnChair(Guest g) {

	}

	public void sitOnChair(Parent p) {

	}

	public static void main(String args[]) {
		Event e = new Event();
		// oneWayOfSitting(e);
		betterWayOfSitting(e);
	}

	private static void betterWayOfSitting(Event e) {
		Sittable s[] = makePeopleWhoCanSit();
		for (Sittable ss : s) {
			e.sitOnChair(ss);
		}

	}

	public void sitOnChair(Sittable ss) {
		ss.sit();

	}

	private static Sittable[] makePeopleWhoCanSit() {
		// TODO Auto-generated method stub
		return null;
	}

	private static void oneWayOfSitting(Event e) {
		Student s[] = makeStudents();
		Guest g[] = makeGuests();
		Parent p[] = makeParents();
		for (Student ss : s) {
			e.sitOnChair(ss);
		}
		for (Guest gg : g) {
			e.sitOnChair(gg);
		}
		for (Parent pp : p) {
			e.sitOnChair(pp);
		}
	}

	private static Parent[] makeParents() {
		// TODO Auto-generated method stub
		return null;
	}

	private static Guest[] makeGuests() {
		// TODO Auto-generated method stub
		return null;
	}

	private static Student[] makeStudents() {
		// TODO Auto-generated method stub
		return null;
	}
}

interface Sittable {
	void sit();
}

class Student implements Sittable {
	public void sit() {
		System.out.println("Student");
	}
}

class Guest implements Sittable {

	@Override
	public void sit() {
		// TODO Auto-generated method stub
		
	}
}

class Parent implements Sittable {

	@Override
	public void sit() {
		// TODO Auto-generated method stub
		
	}
}
