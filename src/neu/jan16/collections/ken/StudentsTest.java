package neu.jan16.collections.ken;

public class StudentsTest {

	public static void main(String[] args) {
		Students students = new Students();
		students.add(1L, "Rose");
		students.add(2L, "Ruby");
		System.out.println(students);
		System.out.println(students.getName(1L));
	}

}
