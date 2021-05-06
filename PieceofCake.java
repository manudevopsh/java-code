import java.util.Scanner;

public class PieceofCake {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int h = sc.nextInt();
		int v = sc.nextInt();
		int slice1=h*v;
		int slice2=(n-h)*v;
		int slice3=(n-h)*(n-v);
		int slice4=(n-v)*h;
		System.out.println(Math.max(Math.max(slice1, slice2), Math.max(slice3, slice4))*4);
	}

}
