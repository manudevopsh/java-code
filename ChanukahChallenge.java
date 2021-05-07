import java.util.Scanner;

public class ChanukahChallenge {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();
		sc.nextLine();
		int result[] = new int[p];
		for (int i = 0; i < p; i++) {
			int k = sc.nextInt();
			int n = sc.nextInt();
			sc.nextLine();
			result[i] = n;
			for (int j = 1; j <= n; j++) {
				result[i] += j;
			}
		}
		for (int i = 0; i < p; i++) {
			System.out.println(i + 1 + " " + result[i]);
		}
	}
}
