package gui;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Calculator extends BaseFrame {

	private JLabel first, second, operation, resultTitle, result;
	private JTextField firstText, secondText;
	private JComboBox operations;

	@Override
	public void create() {
		first = new JLabel("First value : ");
		second = new JLabel("Second value : ");
		operation = new JLabel("Operation : ");
		operations = new JComboBox();
		operations.addItem("+");
		operations.addItem("-");
		operations.addItem("x");
		operations.addItem("/");
		resultTitle = new JLabel("Result : ");
		result = new JLabel("");
		firstText = new JTextField(5);
		secondText = new JTextField(5);
	}

	class OperationListener implements ItemListener {

		@Override
		public void itemStateChanged(ItemEvent e) {
			String x = operations.getSelectedItem().toString();
			System.out.println(x);
			if (x.equals("+")) {
				int a = Integer.parseInt(firstText.getText());
				int b = Integer.parseInt(secondText.getText());
				result.setText(a + b + "");
			}
		}

	}

	@Override
	public void add() {
		Container con = this.getContentPane();
		con.setLayout(new GridLayout(4, 2));
		con.add(first);
		con.add(firstText);
		con.add(second);
		con.add(secondText);
		con.add(operation);
		con.add(operations);
		con.add(resultTitle);
		con.add(result);

	}

	@Override
	public void addListener() {
		OperationListener ol = new OperationListener();
		operations.addItemListener(ol);

	}

	public static void main(String args[]) {
		new Calculator();
	}

}
