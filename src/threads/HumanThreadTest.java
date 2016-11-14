package threads;

public class HumanThreadTest {

	public static void main(String[] args) throws Exception {
		Human h = new Human();
		h.setName("Jay");
		HumanTalkingThread talk = new HumanTalkingThread(h);
		HumanThinkingThread think = new HumanThinkingThread(h);
		SwallowThread swallow = new SwallowThread(h);
		talk.start();
		think.start();
		swallow.start();

		Human rose = new Human();
		rose.setName("Rose");
		// HumanTalkingThread rt = new HumanTalkingThread(rose);
		Thread rt = new Thread(new HumanTalkingRunnable(rose));
		HumanThinkingThread rtt = new HumanThinkingThread(rose);
		SwallowThread rs = new SwallowThread(rose);
		rt.start();
		rtt.start();
		rs.start();

		// talk.start();
	}

}

class SwallowThread extends Thread {
	Human h;

	SwallowThread(Human h) {
		this.h = h;
	}

	public void run() {
		h.swallow();
	}
}

class HumanTalkingRunnable implements Runnable {
	private Human h;

	public HumanTalkingRunnable(Human h) {
		this.h = h;
	}

	@Override
	public void run() {
		h.talk();

	}

}

class HumanTalkingThread extends Thread {
	private Human h;

	public HumanTalkingThread(Human h) {
		this.h = h;
	}

	public void run() {
		h.talk();
	}
}

class HumanThinkingThread extends Thread {
	private Human h;

	public HumanThinkingThread(Human h) {
		this.h = h;
	}

	public void run() {
		h.think();
	}

}
