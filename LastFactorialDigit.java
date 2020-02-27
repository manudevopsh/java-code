import java.util.Scanner;
public class LastFactorialDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int[] n = new int[10];
		for(int i =0;i<t;i++) {
			int result=1;
			n[i]=sc.nextInt();
			for(int j =1;j<=n[i];j++) {
				result=result*j;
			}
			System.out.println(result%10);
		}

	}

}
