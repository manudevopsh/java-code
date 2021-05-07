import java.util.Scanner;
import java.lang.Math;
public class Ladder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int v = sc.nextInt();
		System.out.println((int)(h/(Math.sin(Math.toRadians(v))))+1);

	}

}
