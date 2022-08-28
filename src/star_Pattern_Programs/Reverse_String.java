package star_Pattern_Programs;

public class Reverse_String {
	// public class Reverse_palimdrom {
	public static void main(String[] args) {
		String org = "madam";
		String rev = "";

		for (int i = org.length() - 1; i >= 0; i--) {
			rev = rev + org.charAt(i);

		}
		System.out.println(rev);

		if (org.equals(rev)) {
			System.out.println("given String is palindrome");
		} else {
			System.out.println("not palindrome");
		}
	}

}
