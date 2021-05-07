import java.util.Scanner;

public class ElectricalOutlets {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result[] = new int[n];
		for (int i = 0; i < n; i++) {
			result[i] = 0;
			int k = sc.nextInt();
			result[i] += sc.nextInt();
			for (int j = 1; j < k; j++) {
				result[i] += (sc.nextInt() - 1);
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.println(result[i]);
		}
	}

}
