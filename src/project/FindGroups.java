package project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindGroups {
	public static void main(String args[]) {
		List<String> students = getStudents();
		int count = 0;
		while (true) {
			if (students.size() == 0)
				break;
			int x = (int) (Math.random() * students.size());
			String student = students.get(x);
			System.out.println(count + " - " + student);
			count++;
			if (count % 4 == 0) {
				System.out.println("----------");
			}
			students.remove(student);
		}
	}

	private static List<String> getStudents() {
		String[] names = { "Rachel", "Xiaoyue", "Ruby", "Rose", "Yalin", "Rashmita", "Anjali", "Neha", "Serena", "Rick",
				"Jojo", "Sang", "Jia", "Jay", "Siddhant", "Zhikun", "Sheng", "Sida", "Michael", "Zac", "Carlton", "Gao",
				"Jim", "Ken", "Vishaal" };
		return new ArrayList<String>(Arrays.asList(names));
	}
}
