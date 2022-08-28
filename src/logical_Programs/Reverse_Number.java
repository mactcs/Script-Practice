package logical_Programs;

public class Reverse_Number {
	public static void main(String[] args) {
		int num = 12344321;
		int rev = 0;

		for (int i = num; i > 0; i = i / 10) {
			int rem = i % 10;
			rev = rev * 10 + rem;
		}
		System.out.println(rev);

		// check number palindrom
		if (num == rev) {
			System.out.println("palindrom");
		} else {
			System.out.println("not palindrom");
		}
	}
}
