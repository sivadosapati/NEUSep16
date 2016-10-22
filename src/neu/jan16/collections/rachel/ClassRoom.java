package neu.jan16.collections.rachel;

import java.util.ArrayList;

import java.util.List;

/**
 * write a program for classromm that contain an array of atudent
 * 
 * -join the class -leave the class -counting the number of student in the class
 * -swapping a student with another student
 */
public class ClassRoom {
	List<NeuStudent> studentList = new ArrayList<NeuStudent>(5);


	public ClassRoom() {
		for (int i = 0; i < studentList.size(); i++) {
			studentList.add(new NeuStudent("NeuStudent" + i));
		}
	}

	public static void main(String[] args) {

	}

	public void joinTheClass(NeuStudent stu) {
		this.studentList.add(stu);
	}

	public void leaveTheClass(NeuStudent stu) {
		this.studentList.remove(stu);
	}

	public int getTheNumber() {
		return studentList.size();
	}

	public void swappingStudent(NeuStudent a, NeuStudent b) {
		int indexA = 0, indexB = 0;
		indexA = studentList.indexOf(a);
		indexB = studentList.indexOf(b);
		studentList.set(indexA, b);
		studentList.set(indexB, a);
	}

	public void moveStudentToDifferentPosition(NeuStudent stu, int position) {
		studentList.add(position, stu);
	}
}

class NeuStudent {
	private String name;

	public NeuStudent(String name) {
		this.name = name;
	}
}