import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] input=new int[n];
		for(int i=0;i<n;i++) {
			input[i]=sc.nextInt();
		}
		for(int i=n-1;i>=0;i--) {
			System.out.println(input[i]);
		}

	}

}
