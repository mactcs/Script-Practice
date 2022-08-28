package star_Pattern_Programs;

public class Four_Three_Patter {
	public static void main(String[] args) {
		// 4 4 4 4 4 4 i=1 row= 6
		// 4 3 3 3 3 4 col = 6
		// 4 3 2 2 3 4
		// 4 3 2 2 3 4
		// 4 3 3 3 3 4
		// 4 4 4 4 4 4
		// j=1

		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= 6; j++) {
				if (i == 1 || i == 6 || j == 1 || j == 6) {
					System.out.print(" 4 ");
				} else if (i == 2 || i == 5 || j == 2 || j == 5) {
					System.out.print(" 3 ");
				} else if (i == 3 || i == 4 || j == 3 || j == 4) {
					System.out.print(" 2 ");
				}
			}
			System.out.println();
		}
	}

}
