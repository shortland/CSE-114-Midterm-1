// The answers for these questions are already posted online. This is how I would answer these questions.

// Midterm 1
// Question 8

// String Manipulation 
// Write a complete method called encrypt that takes a single -String- parameter -str- and returns a copy of -str- after replacing each letter in str with the letter immediately after it in the alphabet, except Z is replaced by A and z is replaced with a. Assume str contains only letters. Example: encrypt("Stony") would return "Tupoz". Do NOT write a main() method.


// I'm writing a main method so it'll work.

public class StringManipulation {
	
	public static void main(String[] args) {
		System.out.print(encrypt("Stony") + "\n");
	}

	public static String encrypt(String str) {
		String newCopy = "";
		for(int i = 0; i < str.length(); i++) {
			char newChar;

			if(str.charAt(i) == 'Z')
				newChar = 'A';
			else if (str.charAt(i) == 'z')
				newChar = 'a';
			else {
				newChar = (char)(((int)str.charAt(i))+1);
			}

			newCopy = newCopy + "" + newChar;
		}
		return newCopy;
	}
}