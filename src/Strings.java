
public class Strings {
	public int findCountOfLetterIInString(String string) {
		char[] charactersInString = string.toCharArray();
		int count = 0;
		for (char ch : charactersInString) {
			if (ch == 'i') {
				count++;
			}
		}
		return count;
	}

	public static void main(String args[]) {
		// System.out.println(new Strings().findCountOfLetterIInString("siva
		// dosapati"));
		Strings strings = new Strings();
		String reversedWord = strings.reverseWords("I love Seattle");
		System.out.println(reversedWord);
	}

	public String reverseWords(String sentence) {
		String words[] = sentence.split(" ");
		String reversedWord = "";
		int count = 0;
		for (String word : words) {
			/*if( count == 0){
				reversedWord = word;
				count++;
				continue;
			}*/
			reversedWord = word + " " + reversedWord;
		}
		return reversedWord.substring(0, reversedWord.length() - 1);
		//return reversedWord;
	}
}
