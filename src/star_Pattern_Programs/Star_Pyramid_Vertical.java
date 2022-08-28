package star_Pattern_Programs;

public class Star_Pyramid_Vertical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int star = 1;
		for (int i = 1; i <= 7; i++) {// row =7
			for (int j = 1; j <= star; j++) {
				System.out.print("*");
			}
			System.out.println();
			if (i <= 3) {
				star++;
			} else {
				star--;
			}
		}
	}

}
