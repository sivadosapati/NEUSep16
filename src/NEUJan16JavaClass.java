
public class NEUJan16JavaClass {
	float student1Grade;
	int student1DaysAttended;
	String student1Name;

	float student2Grade;
	int student2DaysAttended;
	String student2Name;

	float studentGrades[] = new float[25];
	int studentDaysAttended[] = new int[10];
	String studentName[] = new String[25];

	StudentOfNEU students[] = new StudentOfNEU[25];

	int[] arrangeInAscendingOrder(int numbers[]) {
		// Logic
		int output[] = new int[3];
		return output;
	}

	public static void main(String args[]) {

		int numbers[] = { 11, 7, 19 };//7,11,19

		NEUJan16JavaClass javaClass = new NEUJan16JavaClass();

		int output[] = javaClass.arrangeInAscendingOrder(numbers);
		
		System.out.println(output[0]);
		
		System.out.println(output[1]);
		
		System.out.println(output[2]);
		
		StudentOfNEU student = new StudentOfNEU();
		student.name = "Rachel";
		student.grade = 3.8f;
		javaClass.students[0] = student;

		System.out.println(javaClass.students[12]);

		javaClass.student1Name = "Rachel";
		javaClass.student1Grade = 3.8f;

		javaClass.studentName[0] = "Rachel";
		javaClass.studentGrades[0] = 3.8f;

		javaClass.studentName[1] = "Serena";
		javaClass.studentGrades[1] = 3.75f;

		System.out.println(javaClass.studentName[1]);

		System.out.println(javaClass.studentName[12]);
		System.out.println(javaClass.studentName[16]);

		System.out.println(javaClass.studentGrades[13]);

		System.out.println(javaClass.studentName[10]);
		System.out.println(javaClass.studentName.length);
	}

}

class StudentOfNEU {
	float grade;
	int daysAttended;
	String name;

}
