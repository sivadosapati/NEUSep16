package threads;

public class HumanTest {

	public static void main(String[] args) {
		Human h = new Human();
		h.talk();//Thread for talking -> start this thread
		h.think();//Thread for thinking -> start this thread

	}

}
