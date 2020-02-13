import java.util.Scanner;
public class BatterUp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] bats= new int [100];
		int x=n;
		double result=0;
		for(int i=0;i<n;i++) {
			bats[i]=sc.nextInt();
			if(bats[i]==-1) {
				bats[i]=0;
				x-=1;
			}
			result+=bats[i];
		}
		result=result/x;
		System.out.println(result);
	}
}
