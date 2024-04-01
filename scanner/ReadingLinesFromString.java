package scanner;

import java.util.Scanner;

public class ReadingLinesFromString {
	public static void main(String args[]) {
		String lines = "This is the first line\n"
				+ "This is the second line\n"
				+ "This is the last line";
		try (Scanner sc = new Scanner(lines)) {
			while (sc.hasNextLine()) { // [Esta es la primera l�nea]
				String linea = sc.nextLine(); // [Esta es la segunda l�nea]
				System.out.println("[" + linea + "]"); // [Esta es la �ltima l�nea]
			}
		}
	}
}
