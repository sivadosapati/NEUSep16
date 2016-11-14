package threads;

public class Human {
	private String name;

	public void setName(String name) {
		this.name = name;
	}

	public synchronized void swallow() {
		loop(100, "Swallowing");
	}

	protected void loop(int pauseTime, String message) {
		for (int i = 0; i < 10; i++) {
			System.out.println(i + " -> " + name + " -> " + message);
			pause(pauseTime);
		}

	}

	public void think() {
		loop(100, "Thinking");
	}

	public synchronized void talk() {
		loop(250, "Talking");
	}

	public void pause(int x) {
		try {
			Thread.sleep(x);
		} catch (Exception e) {
		}
	}
}
