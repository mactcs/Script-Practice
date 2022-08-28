package star_Pattern_Programs;

public class Star_Square_Mid_blank1 {// 4*3 matrix

	public static void main(String[] args) {
		for (int i = 1; i <= 3; i++) {// outer
			for (int j = 1; j <= 4; j++) {// inner
				if (i == 1 || i == 3 || j == 1 || j == 4) {
					System.out.print(" * ");
				} else {
					System.out.print("   ");
				} // close the else block
			} // inner block
			System.out.println();

		}
	}
}
