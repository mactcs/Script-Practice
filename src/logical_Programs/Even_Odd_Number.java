package logical_Programs;

import java.util.Scanner;

public class Even_Odd_Number {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter no");
		int num = scan.nextInt();

		if (num % 2 == 0) {
			System.out.println("Number is even");
		} else {
			System.out.println("nomber is odd");
		}
	}

}
