package threads;

public class Student extends Human {

	private static Object STUDENT_ANSWER_LOCK = new Object();
	private static Object STUDENT_QUESTION_LOCK = new Object();

	public void answer() {
		synchronized (STUDENT_ANSWER_LOCK) {
			loop(100, "Answering question");
		}
	}

	public synchronized void ask() {
		loop(250, "Ask Question");
	}

	public void leaveClassRoom() {
		synchronized (this) {
			loop(150, "Leave class room");
		}
		loop(120, "Get into car");
	}

	public static void main(String args[]) {
		Student jay = new Student();
		jay.setName("jay");
		Student rose = new Student();
		rose.setName("rose");
		Thread jayThread = createAnswerThread(jay);
		Thread roseThread = createAnswerThread(rose);
		jayThread.start();
		roseThread.start();
	}

	private static Thread createAnswerThread(Student s) {
		return new Thread() {
			public void run() {
				s.answer();
			}
		};
	}
}
