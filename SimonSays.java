import java.util.Scanner;

public class SimonSays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String[] input= new String[n];
		for (int i = 0; i < n; i++) {
			input[i] = sc.nextLine();
		}
		for (int i = 0; i < n; i++) {
			if(input[i].contains("Simon says ")) {
				System.out.println(input[i].replace("Simon says ",""));
			}
		}
	}

}
