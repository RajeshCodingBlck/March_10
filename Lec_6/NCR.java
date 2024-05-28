package Lec_6;

import java.util.Scanner;

public class NCR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		int r = s.nextInt();

		int n_factorial = 1;

		for (int i = 1; i <= n; i++) {

			n_factorial = n_factorial * i;
		}

		int r_factorial = 1;

		for (int i = 1; i <= r; i++) {

			r_factorial = r_factorial * i;
		}

		int n_minus_r_factorial = 1;

		for (int i = 1; i <= (n - r); i++) {

			n_minus_r_factorial = n_minus_r_factorial * i;
		}

		int final_ans = n_factorial / (r_factorial * n_minus_r_factorial);

		System.out.println(final_ans);

	}

}
