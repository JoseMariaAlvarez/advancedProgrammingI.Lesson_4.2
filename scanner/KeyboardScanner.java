package scanner;

import java.util.Scanner;

public class KeyboardScanner {

		static public void main(String[] args) {
			Scanner keyboard = new Scanner(System.in);
			
			System.out.print("Please input your name: ");
			String name = keyboard.next();
			System.out.print("Please input your age: ");
			int age = keyboard.nextInt();
			System.out.println(String.format("Name %s, age %d.", 
					           name, age));
		}
	}
