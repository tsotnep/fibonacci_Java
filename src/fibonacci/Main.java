package fibonacci;

import java.util.Scanner;

public class Main {
	public static int[] n_arr = new int[100];
	public static int n_lastN = 2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		n_arr[1] = n_arr[2] = 1;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(iterFib_N_v3(n));
		sc.close();
	}

	public static int iterFib_N_v3(int n) {
		int I = 0, J = 1;
		if (n_lastN > n) {
			return n_arr[n];
		} else {
			n -= n_lastN;
			J = n_arr[n_lastN];
			I = n_arr[n_lastN - 1];
			while (n > 0) {
				n--;
				J = I + J;
				I = J - I;
				n_arr[J] = J;
			}
		}
		return J;
	}
}
