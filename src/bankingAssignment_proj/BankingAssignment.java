package bankingAssignment_proj;

import java.util.Scanner;

public class BankingAssignment {

	// class body open //

	int currentBal, minBal = 500, depositAmt, withdrawAmt;

	void deposit(int amt) {
		currentBal = currentBal + depositAmt + minBal;
		System.out.println("Updated balance is : " + currentBal);
	}

	void withdraw(int amt) throws Exception {

		if (withdrawAmt > minBal) {
			throw new LessBalanceException(currentBal);
		} else {
			currentBal = currentBal - withdrawAmt;
			System.out.println("You have Withdrawn " + withdrawAmt + " Rupees sucessfully");
			System.out.println("Current Balance is :" + currentBal);
		}
	}

	public static void main(String[] args) { // main body open //
		BankingAssignment obj = new BankingAssignment();
		Scanner s = new Scanner(System.in);
		String ch = "y";
		System.out.println("Hii Kunal Baghele");
		System.out.println("Choose the Action you want to perform.");
		System.out.println(" 1.Deposit Amount \n 2.Withdraw Amount \n 3.Check Balance \n 4.Cancel the Transaction");
		int option;
		System.out.print("Your option : ");
		option = s.nextInt();
		switch (option) {
		case 1:
			System.out.println("Enter amount you want to deposit : ");
			obj.depositAmt = s.nextInt();
			obj.deposit(obj.depositAmt);

			break;
		case 2:
			while (ch.equalsIgnoreCase("y")) { // while open //

				try {
					System.out.println("Enter amount you want to withdraw :");
					int amt = s.nextInt();
					obj.withdraw(amt);
				} catch (Exception e) {
					System.out.println("OOPsss !! : " + e);
					e.printStackTrace();
				} finally {
					System.out.println("Thank You For Banking with us");
				}
				System.out.println("Press y to Perform More Transaction to Your Account");
				ch = s.next();
			} // while close //
			break;
		case 3:
			System.out.println("Your Balance is : " + obj.minBal);
			break;
		case 4:
			System.out.println("Your Transaction has been Cancelled");
			break;
		}
	} // main body close //
}// class body close //
