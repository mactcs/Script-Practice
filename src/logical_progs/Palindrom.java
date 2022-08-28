package logical_progs;

import java.util.Scanner;

public class Palindrom {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter no : ");
		int num = s.nextInt();
		int temp = num;
		int rem, res = 0;
		while (temp != 0) {
			rem = temp % 10;
			res = res * 10 + rem;
			temp = temp / 10;
		}
		if (res == num) {
			System.out.println("palimdrom");
		} else {
			System.out.println("not palindrom");
		}

	}

}