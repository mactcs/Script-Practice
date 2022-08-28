package bankingAssignment_proj;

public class LessBalanceException extends Exception {
	// Creating UserDefinedException //
	int currentBal;

	LessBalanceException() {
		System.out.println("Default Constructor for Less Balance Exception");
	}

	LessBalanceException(int currentBal) {
		this.currentBal = currentBal;
		System.out.println("Parameterised constructor for less balance Excepion Called here...num = " + currentBal);
	}

	public String toString() {
		return "Your Balance is LOW !! Updated balance is : " + currentBal;
	}
}