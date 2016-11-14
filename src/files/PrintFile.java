package files;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintFile {

	public static void main(String[] args) throws IOException {
		// String inputFile = "/Users/dosapats/git/a.txt";
		// printContentInFile(file);
		String inputFile = "/Users/dosapats/git/big.txt";
		System.out.println(findTheInContent(inputFile));
		// String outputFile = "/Users/dosapats/git/b.txt";
		// copyContent(inputFile, outputFile);
	}

	private static void copyContent(String inputFile, String outputFile) throws IOException {
		String content = readContentFromFile(inputFile);
		String newContent = "Adding Header--------\n" + content + "\nAdding Footer....";
		FileOutputStream fos = new FileOutputStream(outputFile);
		byte b[] = newContent.getBytes();
		fos.write(b);
		fos.flush();
		fos.close();

	}

	private static void printContentInFile(String file) throws IOException {
		String content = readContentFromFile(file);
		System.out.println(content);
	}

	private static String readContentFromFile(String file) throws FileNotFoundException, IOException {
		long start = System.currentTimeMillis();
		File f = new File(file);
		FileInputStream fis = new FileInputStream(f);
		BufferedInputStream bis = new BufferedInputStream(fis, 8192 * 1092);
		StringBuilder builder = new StringBuilder(100000);
		while (true) {
			// int i = fis.read();
			int i = bis.read();
			if (i == -1) {
				break;
			}
			char ch = (char) i;
			builder.append(ch);
			// System.out.print(ch);
		}

		fis.close();
		bis.close();
		long end = System.currentTimeMillis();
		long totalTime = end - start;
		System.out.println("Total time -> " + totalTime + " millis");
		return builder.toString();
	}

	private static boolean findTheInContent(String file) throws IOException {
		// return readContentFromFile(file).contains("the");
		return findTheInContentUsingBufferedReader(file);
	}

	private static void processStudentsFile(String file, String outputFile) throws Exception {
		BufferedReader reader = new BufferedReader(new FileReader(file));
		PrintWriter writer = new PrintWriter(new FileWriter(outputFile));
		reader.readLine();
		int fc = 0;
		int gc = 0;

		while (true) {
			String line = reader.readLine();
			if (line == null)
				break;
			Student s = makeStudent(line);
			if (s.isFemale()) {
				fc++;

			}
			if (s.getGrade() > 3.75f) {
				gc++;
			}
			if (s.isFemale() && s.getGrade() > 3.75f) {
				writeToStream(writer, s.name);
			}
		}
	}

	private static void writeToStream(PrintWriter writer, String name) {
		writer.println(name);

	}

	private static Student makeStudent(String line) {
		String x[] = line.split("\\|");
		Student s = new Student();
		s.name = x[0];
		s.gender = x[1];
		s.grade = Double.parseDouble(x[2]);
		return s;
	}

	static class Student {
		String name;
		String gender;
		double grade;

		public boolean isFemale() {
			if ("Female".equalsIgnoreCase(gender)) {
				return true;
			}
			return false;
		}

		public float getGrade() {
			return (float) grade;
		}
	}

	private static boolean findTheInContentUsingBufferedReader(String file) throws IOException {
		long start = System.currentTimeMillis();
		File f = new File(file);
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		boolean found = false;
		while (true) {
			String line = br.readLine();
			if (line == null)
				break;
			if (line.contains("the")) {
				found = true;
				break;
			}
		}

		fr.close();
		br.close();
		long end = System.currentTimeMillis();
		long totalTime = end - start;
		System.out.println("Total time -> " + totalTime + " millis");
		return found;

	}

}
