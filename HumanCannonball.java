import java.util.Scanner;

public class HumanCannonball {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			float velocity=sc.nextFloat();
			float angle=sc.nextFloat();
			float dist = sc.nextFloat();
			float h1=sc.nextFloat();
			float h2=sc.nextFloat();
			double radians = Math.toRadians(angle);
			double t=dist/velocity/Math.cos(radians);
			double y = velocity*t*Math.sin(radians)-((9.8*t*t)/2);
			if((y>=(h1+1))&&(y<=(h2-1))) {
				System.out.println("Safe");
			}else {
				System.out.println("Not Safe");
			}
		}

	}

}
//&&(y>=(h2-1))