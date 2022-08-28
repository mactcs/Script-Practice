package star_Pattern_Programs;

public class Star_pyramid {
	public static void main(String[] args) {
		int space = 3;
		int star = 1;
		for (int i = 1; i <= 4; i++) {// row =4 col=7
			for (int j = 1; j <= space; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= star; j++) {
				System.out.print("* ");
//				System.out.print(" ");
			}
			System.out.println();
			star = star + 1;
			space--;
		}
	}

}
//   * 
//  * * 
// * * * 
//* * * * 
