package star_Pattern_Programs;

public class Star_Right_Angle {
//no of opr is 1 is printing *
	public static void main(String[] args) {
		int star = 1;// 1st row star
		for (int i = 1; i <= 5; i++) {// row =5
			for (int j = 1; j <= star; j++) {// col=5
				System.out.print("*");
			}
			System.out.println();
			star++;
		}

	}

}
/*
*
**
***
****
*****
*/