package interfaces;

import neu.jan16.lecture7.Test;

public class Hospital {
	public static void main(String args[]) {
		Test t = new Test();

		Person rose = new Person("Rose");
		Person rachel = new Person("Rachel");
		rose.digHoleInEarth();
		rachel.digHoleInEarth();
		Person.digHoleInEarth();
		System.out.println(rose.sum(5, 7));
		// System.out.println(Person.sum(67, 5));
		Male siva = new Male("Siva");
		Male.digHoleInEarth();
		System.out.println(Person.e.peopleCount);
	}
}
