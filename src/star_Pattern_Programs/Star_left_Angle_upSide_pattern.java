package star_Pattern_Programs;

public class Star_left_Angle_upSide_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int star = 5;
		int space = 0;

		for (int i = 1; i <= 5; i++) {// outer loop ie row=5
			for (int j = 1; j <= space; j++) {// inner loop ie col=5 print spaces
				System.out.print(" ");
			}
			for (int j = 1; j <= star; j++) {
				System.out.print("*");
			}

			System.out.println();
			star--;
			space++;
		}
	}
}
/*
*****
 ****
  ***
   **
    *
 */