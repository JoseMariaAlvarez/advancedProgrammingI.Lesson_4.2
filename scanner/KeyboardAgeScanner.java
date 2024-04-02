package scanner;

import java.util.Scanner;

public class KeyboardAgeScanner {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please input your age: ");
		while (!keyboard.hasNextInt()) {
			keyboard.next();	// next datum is discarded
			System.out.print("Please input your age again: ");
		}	
		int age = keyboard.nextInt();
		System.out.println("Age: " + age);
	}
}

