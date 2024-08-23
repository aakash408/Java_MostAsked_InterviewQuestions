package string;

public class Reverse_Words {

	public static void main(String[] args) {
		// Java program to reverse each word of a given string
		
		reverseeachwordofstring("Java is a good programming Language");

	}

	static void reverseeachwordofstring(String inputString) {
		String[] words = inputString.split(" ");

		String reverseString = "";

		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			String str = "";
			char ch;

			for (int j = 0; j < word.length(); j++) {
				ch = word.charAt(j);
				str = ch + str;
			}

			reverseString = reverseString + str + " ";
		}
		System.out.println(inputString);
		System.out.println(reverseString);
	}

}
