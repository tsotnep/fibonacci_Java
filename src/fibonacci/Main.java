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
		System.out.println(recFib_N(n));
		sc.close();
	}

	public static int recFib_N(int n) {
		if (n_lastN >= n)
			return n_arr[n];
		else {
			n_arr[n] = (recFib_N(n - 1) + recFib_N(n - 2));
			n_lastN = n;
			return n_arr[n];
		}
	}

}
