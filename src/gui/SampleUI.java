package gui;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class SampleUI {

	public static void main(String[] args) {
		// Step 1 - Create Top Level Container

		JFrame frame = new JFrame();
		frame.setTitle("Hello All");

		// Step 2 - Create Components
		JButton button = new JButton("Click me");
		JCheckBox check = new JCheckBox();
		JTextField text = new JTextField(10);
		JButton reverseButton = new JButton("Reverse the content");

		// Step 3 - Create and Set Layout
		FlowLayout fl = new FlowLayout();

		Container con = frame.getContentPane();
		con.setLayout(fl);

		// Step 4 - Add components
		con.add(button);
		con.add(check);
		con.add(text);
		con.add(reverseButton);
		// Step 5 - Create Listener

		ClickMeListener cml = new ClickMeListener();
		button.addActionListener(cml);
		ReverseListener rl = new ReverseListener();

		reverseButton.addActionListener(rl);
		rl.setText(text);
		cml.setFrame(frame);

		// Step 6 - Make the top level container visible by setting size

		frame.setSize(400, 300);
		frame.setVisible(true);

	}

}

class ClickMeListener implements ActionListener {
	int cnt = 0;
	private JFrame frame;

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		cnt++;
		System.out.println("Button clicked");
		if (cnt == 3) {
			closeWindow();
		}
	}

	private void closeWindow() {
		frame.dispose();

	}

}

class ReverseListener implements ActionListener {
	private JTextField text = null;

	@Override
	public void actionPerformed(ActionEvent e) {
		String t = text.getText();
		String r = new StringBuffer(t).reverse().toString();
		text.setText(r);
	}

	public void setText(JTextField tf) {
		this.text = tf;
	}

}
