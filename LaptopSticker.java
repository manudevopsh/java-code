import java.util.Scanner;

public class LaptopSticker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int wc = sc.nextInt();
		int hc = sc.nextInt();
		int ws = sc.nextInt();
		int hs = sc.nextInt();
		if(((wc-2)>=ws) && ((hc-2)>=hs)) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}

	}

}
