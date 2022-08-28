package logical_Programs;

import java.util.Scanner;

public class Palindrom_prog {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("enter no :");
		int num = s.nextInt();
		int temp = num;
		int rem, res1 = 0;

		while (temp > 0) {
			rem = temp % 10;
			res1 = res1 * 10 + rem;
			temp = temp / 10;
		}
		if (res1 == num) {
			System.out.println("pali");
		} else {
			System.out.println("not pal");
		}

	}

}
