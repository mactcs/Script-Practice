package logical_Programs;

public class Print_hundred_to_one {
	public static void main(String[] args) {
		for (int i = 10; i >= 1; i--) {
			for (int j = 10; j >= 1; j--) {
				System.out.print(i * j + "\t");
			}
			System.out.println();
		}
	}
}
