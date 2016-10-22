package neu.jan16.collections.rose;

public class ClassRoom {
	private int[] chairs;
	private int totalStudentNumber;

	public ClassRoom() {
		chairs = new int[5];
		totalStudentNumber = 0;
	}

	public int countStudent() {
		System.out.println(totalStudentNumber);
		return totalStudentNumber;
	}

	public void joinClass(Student s1) {
		if (countStudent() == 5) {
			resizeArray();
		}
		chairs[totalStudentNumber] = s1.studentID;
		totalStudentNumber++;
	}

	public void leaveStudent(Student s2) {
		if (totalStudentNumber <= 0) {
			System.out.println("no student in the classroom");
		}
		int idx = -1;
		for (int i = 0; i < chairs.length; i++) {
			if (chairs[i] == s2.studentID) {
				idx = i;
				break;
			}
		}
		chairs[idx] = 0;
	}

	public void swap(Student s1, Student s2) {
		int idx1 = -1;
		int idx2 = -1;
		for (int i = 0; i < totalStudentNumber; i++) {
			if (chairs[i] == s1.studentID) {
				idx1 = i;
			} else if (chairs[i] == s2.studentID) {
				idx2 = i;
			}
			if (idx1 != -1 && idx2 != -1) {
				break;
			}
		}
		chairs[idx1] = s2.studentID;
		chairs[idx2] = s1.studentID;
	}

	private void resizeArray() {
		int n = chairs.length + 5;
		int[] newArray = new int[n];
		for (int i = 0; i < chairs.length; i++) {
			newArray[i] = chairs[i];
		}
		chairs = newArray;
	}

}

class Student {
	public int studentID;
	private String studentName;
}