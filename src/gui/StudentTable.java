package gui;

import java.awt.Container;
import java.awt.FlowLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class StudentTable extends BaseFrame {

	private JTable studentTable;

	@Override
	public void create() {
		StudentTableModel stm = new StudentTableModel();
		Student s = new Student("Rose", "Female", 3.75);
		stm.addStudent(s);
		stm.addStudent(new Student("Vishaal", "Male", 3.90));
		studentTable = new JTable(stm);
	}

	@Override
	public void add() {
		Container con = getContentPane();
		con.setLayout(new FlowLayout());
		con.add(new JScrollPane(studentTable));
	}

	@Override
	public void addListener() {
		// TODO Auto-generated method stub

	}

	public static void main(String args[]) {
		new StudentTable();
	}

}

class Student {
	public Student(String name, String gender, double g) {
		this.name = name;
		this.gender = gender;
		this.grade = g;
	}

	String name;
	String gender;
	double grade;
}

class StudentTableModel implements TableModel {

	private List<Student> students = new ArrayList<Student>();

	public void addStudent(Student s) {
		this.students.add(s);
	}

	@Override
	public int getRowCount() {
		return students.size();
	}

	@Override
	public int getColumnCount() {
		return 3;
	}

	@Override
	public String getColumnName(int columnIndex) {
		if (columnIndex == 0) {
			return "Name";
		}
		if (columnIndex == 1) {
			return "Gender";
		}
		return "Grade";
	}

	@Override
	public Class<?> getColumnClass(int columnIndex) {
		return java.lang.String.class;
	}

	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		System.out.println(rowIndex + "->" + columnIndex);
		Student s = students.get(rowIndex);
		if (columnIndex == 0) {
			return s.name;
		}
		if (columnIndex == 1) {
			return s.gender;
		}
		return s.grade;
	}

	@Override
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addTableModelListener(TableModelListener l) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeTableModelListener(TableModelListener l) {
		// TODO Auto-generated method stub

	}

}
