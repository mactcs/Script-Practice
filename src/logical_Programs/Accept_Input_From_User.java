package logical_Programs;

import java.util.Scanner;

public class Accept_Input_From_User {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String:");
		int num1 = scan.nextInt();
		System.out.println("Enter 2nd String");
		int num2 = scan.nextInt();
		System.out.println("Addition is:" + (num1 + num2));
	}

}
