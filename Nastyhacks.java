import java.util.Scanner;
public class Nastyhacks {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			int revenue = sc.nextInt();
			int expected = sc.nextInt();
			int cost = sc.nextInt();
			if(expected - cost > revenue) {
				System.out.println("advertise");
			}
			if(expected - cost < revenue) {
				System.out.println("do not advertise");
			}
			if(expected - cost == revenue) {
				System.out.println("does not matter");
			}
			sc.nextLine();
			}
		}
}
