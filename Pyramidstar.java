package Pattren;

public class Pyramidstar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 5;
		int temp = num;
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num - i; j++) {
				System.out.print(" ");
			}
			for (int x = 1; x <= (2 * i - 1); x++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int a = num - 1; a >= 1; a--) {
			for (int b = num; b > a; b--) {
				System.out.print(" ");
			}
			for (int c = 1; c <= (2 * a - 1); c++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
