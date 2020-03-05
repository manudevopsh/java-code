import java.util.Scanner;
public class SpeedLimit {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int s,t;
		while(n!=(-1)) {
			int pt=0,result=0;
			for(int i=0;i<n;i++) {
				s=sc.nextInt();
				t=sc.nextInt();
				result+=s*(t-pt);
				pt=t;
			}
			System.out.println(result +" miles");
			n=sc.nextInt();
		}
	}
}
