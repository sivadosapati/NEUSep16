package files;

import java.io.File;
import java.util.Date;

public class TxtFinder {

	public static void main(String[] args) {
		String path = "/Users/dosapats/git";
		int x = findTxtFiles(path, "txt");
		System.out.println("Total Number of Text Files -> " + x);
	}

	private static int findTxtFiles(String path, String extension) {
		int countTxtFiles = 0;
		File file = new File(path);
		if (isTextFile(file, extension)) {
			countTxtFiles++;
			return countTxtFiles;
		}
		if (file.isDirectory()) {
			countTxtFiles += getTxtFilesInDirectory(file, extension);
		}
		return countTxtFiles;
	}

	private static int getTouchedFiles(String path) {
		int touched = 0;
		File f = new File(path);
		if (f.isDirectory()) {
			for (File file : f.listFiles()) {
				long diff = new Date().getTime() - file.lastModified();
				if (diff < 24 * 60 * 60 * 1000) {
					System.out.println(file.getName());
					touched++;
				}
			}
		}
		return touched;
	}

	private static boolean isTextFile(File file, String extension) {
		String absPath = file.getAbsolutePath();
		// System.out.println(absPath);
		if (absPath.endsWith("." + extension)) {
			System.out.println(absPath);
			return true;
		}
		return false;

	}

	private static int getTxtFilesInDirectory(File f, String extension) {
		int count = 0;
		for (File file : f.listFiles()) {
			if (file.isDirectory()) {
				count += getTxtFilesInDirectory(file, extension);
				continue;
			}
			if (isTextFile(file, extension)) {
				count += 1;
			}
		}
		return count;
	}

}
