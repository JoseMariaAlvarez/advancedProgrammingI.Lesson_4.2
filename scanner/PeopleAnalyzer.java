package scanner;

import java.util.Scanner;

class Person{
	private String name;
	private int age;
	public Person(String n, int a) { name = n; age = a;}
	public String toString() { return "(" + name + ", " + age +")";}
}

public class PeopleAnalyzer {
		public static void main(String[] args) {
			String data = 
				"John Smith,23.Cindy Adams:15.Louise McArthur-19.Andrew Bloom-22";
			Scanner sc = new Scanner(data);
			sc.useDelimiter("[.]");  // Exactly a period
			while (sc.hasNext()) {
				String dataPerson = sc.next();
				Scanner scPerson = new Scanner(dataPerson);
				scPerson.useDelimiter("[,:-]"); // Separators: ,:- (one occurrence)
				String name = scPerson.next();
				int age = scPerson.nextInt();
				Person p = new Person(name, age);
				System.out.println(p);
				scPerson.close();
			}
			sc.close();
		}
	}