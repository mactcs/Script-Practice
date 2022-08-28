package logical_Programs;

public class Reverse_String {
	public static void main(String[] args) {
		String org = "MAMa";
		String rev = "";
		for (int i = org.length() - 1; i >= 0; i--) {
			rev = rev + org.charAt(i);
		}
		System.out.println(rev);

		if (org.equals(rev)) {
			System.out.println("Palindrom");
		} else {
			System.out.println("not palindrom");
		}
	}
}
