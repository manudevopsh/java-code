import java.util.Scanner;

public class Stopwatch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] t = new int[n];
		int finaltime = 0;
		for (int i = 0; i < n; i++) {
			t[i] = sc.nextInt();
		}
		if (n % 2 == 1) {
			System.out.println("Still running");
		} else {
			for (int i = 0; i < n; i++) {
				if ((i > 0) && (i % 2) == 1) {
					finaltime = finaltime + (t[i] - t[i - 1]);
				}
			}
			System.out.println(finaltime);
		}

	}
}
