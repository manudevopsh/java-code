import java.util.Scanner;
public class Qaly {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double result=0;
		for(int i =0;i<n;i++) {
			double q= sc.nextDouble();
			double y= sc.nextDouble();
			result+=q*y;
		}
		System.out.println(result);
	}

}
