package gui;

import javax.swing.JFrame;

public abstract class BaseFrame extends JFrame {
	public BaseFrame() {
		create();
		add();
		addListener();
		setup();
	}

	public abstract void create();

	public abstract void add();

	public abstract void addListener();

	public void setup() {
		setSize(600, 600);

		setVisible(true);
		pack();
	}
}
