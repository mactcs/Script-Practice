package logical_Programs;

import java.util.Scanner;

public class Replace_Special_Character_in_String {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name = scan.next();
		String correctname = name.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(correctname);

	}

}
