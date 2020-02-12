import java.util.Scanner;
public class DiceCup {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m =sc.nextInt();
		int high,low;
		if(n>=m) {
			high=n;
			low=m;
		}
		else{
			high=m;
			low=n;
		}
		for(int i=(low+1);i<=(high+1);i++) {
			System.out.println(i);
		}

	}

}
