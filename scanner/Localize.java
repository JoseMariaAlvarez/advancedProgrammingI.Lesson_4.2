package scanner;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Localize {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner("Joe 7.2 Mary 8.5")) {
			sc.useLocale(Locale.ENGLISH); // decimal point Locale.FRENCH decimal comma
			String nombre1 = sc.next();
			double nota1 = sc.nextDouble();
			String nombre2 = sc.next();
			double nota2 = sc.nextDouble();
			System.out.println(nombre1 + ": " + nota1); // Joe: 7.2
			System.out.println(nombre2 + ": " + nota2); // Mary: 8.5
		} catch (InputMismatchException e) {
			System.out.println("Error when extracting mark");
		} catch (NoSuchElementException e) {
			System.out.println("Error when extracting data");
		}
	}

}
