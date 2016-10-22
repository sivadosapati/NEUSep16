package neu.jan16.collections.chunan;

public class ClassRoom {
	public Student[] students = new Student[5];

	public int countStudents() {
		int count = 0;
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null) {
				count++;
			}
		}
		return count;
	}

	public void swapStudents(Student s1, Student s2) {
		int index1 = 0;
		int index2 = 0;
		Student temp;

		for (int i = 0; i < students.length; i++) {
			if (students[i].equals(s1)) {
				index1 = i;
			}
			if (students[i].equals(s2)) {
				index2 = i;
			}
		}

		temp = students[index1];
		students[index1] = students[index2];
		students[index2] = temp;
	}

	public void moveStudent(Student s, int destinationIndex) {
		int index = 0;
		for (int i = 0; i < students.length; i++) {
			if (students[i].equals(s)) {
				index = i;
				break;
			}
		}
		if (students[destinationIndex] != null) {
			swapStudents(s, students[destinationIndex]);
		} else {
			students[destinationIndex] = s;
			students[index] = null;
		}
	}
}

class Student {
	public static ClassRoom classRoom = new ClassRoom();

	public void joinClass() {
		for (int i = 0; i < classRoom.students.length; i++) {
			if (classRoom.students[i] == null) {
				classRoom.students[i] = this;
				break;
			}
		}
	}

	public void leaveClass() {
		for (int i = 0; i < classRoom.students.length; i++) {
			if (classRoom.students[i].equals(this)) {
				classRoom.students[i] = null;
				break;
			}
		}
	}
}