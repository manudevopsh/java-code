import java.util.Scanner;

public class JumboJavelin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum=0;
		for(int i=0;i<n;i++) {
			int l=sc.nextInt();
			sum=sum+l;
		}
		sum=sum-n+1;
		System.out.println(sum);

	}

}
