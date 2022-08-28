package star_Pattern_Programs;

public class Star_Pyramid_Pattern {
	public static void main(String[] args) {// no of opration =2 i.space ii. star
		int space = 3;
		int star = 1;
		for (int i = 1; i <= 4; i++) {// row =4 col=7
			for (int j = 1; j <= space; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= star; j++) {
				System.out.print("*");
			}
			System.out.println();
			star = star + 2;// star increment in every row by 2
			space--;
		}
	}

}
//   *
//  ***
// *****
//*******
