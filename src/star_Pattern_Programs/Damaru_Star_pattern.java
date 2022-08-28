package star_Pattern_Programs;

public class Damaru_Star_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// *****
		 // ***
		  // *
		 // ***
		// *****
		int star = 9;
		int space = 1;

		for (int i = 1; i <= 9; i++) {// row
			for (int j = 1; j <= space; j++) {// col
				System.out.print(" ");
			}
			for (int j = 1; j <= star; j++) {
				System.out.print("*");
			}
			System.out.println();
			if (i <= 4) {
				space++;
				star = star - 2;
			} else {
				space--;
				star = star + 2;
			}

		}
	}
}
