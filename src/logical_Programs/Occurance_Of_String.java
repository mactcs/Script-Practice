package logical_Programs;

import java.util.Scanner;

public class Occurance_Of_String {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str;
		int count = 0;
		char c = 'm';
		System.out.println("enter string:");
		str = s.nextLine();
		for (int i = 0; i < str.length(); i++) {
			if (c == str.charAt(i)) {
				count++;
			}
		}
		System.out.println(c + " = " + count);
	}

}
