package array_Prac;

import java.util.Arrays;

public class Ascending_order_data_in_Array {
	public static void main(String[] args) {
		int ar[] = { 90, 45, 60, 20, 30, 10 };
		// print entire data
		// for(int i=0;i<=ar.length-1;i++) {
		// System.out.println(ar[i]);
		// print data in Ascending order
		Arrays.sort(ar);
		for (int i = 0; i <= ar.length - 1; i++) {
			System.out.print(ar[i] + " ");

		}
		System.out.println("\n");
		for (int i : ar) {
			System.out.print(i + " ");
		}
	}
}
