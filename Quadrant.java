import java.util.Scanner;
public class Quadrant {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		int output = 0;
		if(x>0&&y>0) {
			output=1;
		}
		else if(x<0&&y>0) {
			output=2;
		}
		else if(x<0&&y<0) {
			output=3;
		}
		else if(x>0&&y<0) {
			output=4;
		}
		System.out.println(output);
		}

}
