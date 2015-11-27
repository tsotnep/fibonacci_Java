package fibonacci;

import java.util.Scanner;

public class Main {
	public static int[] n_arr = new int[100];
	public static int n_lastN = 2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(iterFib_N_v2(n));
		sc.close();
	}

	public static int iterFib_N_v2(int n) {
		int I = 0, J = 1;
		while (n > 0) {
			n--;
			J = I + J;
			I = J - I;
		}
		return J;
	}

}
