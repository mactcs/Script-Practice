package logical_Programs;

public class Print_one_to_hundred {
	public static void main(String[] args) {
// 1 to 100 nos only
//		for (int i = 1; i <= 100; i++) {
//			System.out.println(i);
//		}
		// multiplication table
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {

				System.out.print(i * j + "\t");
			}
			System.out.println();
			System.out.println();
		}
	}

//		System.out.print("Multiplication table using nested for loop: \n");
//		for (int a = 1; a <= 10; a++) {
//			for (int b = 1; b <= 10; b++) {
//				System.out.print(a * b + "\t");
//			}
//			System.out.println();
//		}
//	}

}
