package stringJoiner;

import java.util.StringJoiner;

public class StringJoinerExample {

	public static void main(String[] args) {
		StringJoiner sj = new StringJoiner(" - ", "[", "]");
		sj.add("hello").add("how").add("are").add("you?"); 	
		System.out.println(sj.toString());
		String[] colours = {"green", "yellow", "black", "white"};
		StringJoiner sjc = new StringJoiner(", ", "[", "]");
		for (String s : colours) {
			sjc.add(s);
		}
		System.out.println(sjc.toString());
	}
}
