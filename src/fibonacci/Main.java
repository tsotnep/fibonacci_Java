package fibonacci;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(recFib_2N(n));
		sc.close();
	}

	public static int recFib_2N(int n) {
		if (n == 0)
			return 0;
		else if (n == 1)
			return 1;
		else if (n == 2)
			return 1;
		else
			return (recFib_2N(n - 1) + recFib_2N(n - 2));
	}

}
