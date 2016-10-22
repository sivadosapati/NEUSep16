package neu.jan16.exceptions;

public class Student {
	private String name;

	private int getRandomNumber(int x) {
		return (int) (Math.random() * x);
	}

	public Student(String name) {
		this.name = name;
	}

	public void comeToClass() throws BusNotRunningException {
		waitForTheBus();
		getIntoTheBus();
	}

	private void getIntoTheBus() throws RoadNotWorkingException {
		int x = getRandomNumber(10);
		if (x > 8) {
			throw new RoadNotWorkingException();
		}
		System.out.println(name + " is getting into Bus");

	}

	private void waitForTheBus() throws BusNotRunningException {
		int x = getRandomNumber(10);
		if (x > 5) {
			throw new BusNotRunningException();
		}
		System.out.println(name + " is waiting for the Bus");

	}

	public static void main(String args[]) throws BusNotRunningException {
		String name[] = new String[] { "Rose", "Serena", "Jay", "Rachel", "Michael", "Vishaal", "Rashmita" };
		for (int i = 0; i < name.length; i++) {
			Student s = new Student(name[i]);
			try {
				s.comeToClass();
			} catch (BusNotRunningException be) {
				// System.out.println(name[i] + " couldn't get into bus");
				break;
			}
		}
		System.out.println("Move on..");
	}
}

class RoadNotWorkingException extends RuntimeException {

}

class BusNotRunningException extends Exception {

}
