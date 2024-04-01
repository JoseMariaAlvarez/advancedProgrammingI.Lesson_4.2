package scanner;

import java.util.Scanner;

public class PlayersScanner {

	public static void main(String[] args) {
				Scanner s = new Scanner("{Alisson; Thiago; Mohamed}");
//				s.useDelimiter("[{}; ]+");
//				s.useDelimiter("[^a-zA-Z0-9]+");
				s.useDelimiter("\\s*[,;:{}]\\s*");
				for (int i = 0; i< 3; i++) {
					System.out.println("<" + s.next() +">");
				}
		//		Scanner s2 = new Scanner("123.9 456.0 789");
		////		s.useDelimiter("; ");
		//		for (int i = 0; i< 3; i++) {
		//			if (s2.hasNextInt()) {
		//				System.out.println("<" + s2.nextInt() +">");
		//			} else { 
		//				System.out.println("<<" + s2.nextDouble() +">>");
		//			}		}
		//		Scanner s3 = new Scanner(System.in);
		////		s.useDelimiter("; ");
		//		for (int i = 0; i< 3; i++) {
		//			System.out.println("<" + s3.nextInt() +">");
		//		}
		//		
//		Scanner keyboard = new Scanner (System.in);
//		int age = 0;
//		while (age < 18) {
//			System.out.print("Please input your age:");
//			while (!keyboard.hasNextInt()) {
//				keyboard.next();	// next datum is discarded
//				System.out.print("Please input your age again:");
//			}	
//			age = keyboard.nextInt();
//		}
//		System.out.println("***" + age + "***");

	}


}


