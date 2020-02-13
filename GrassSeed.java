import java.util.Scanner;
public class GrassSeed {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double c = sc.nextDouble();
		int num= sc.nextInt();
		double area=0;
		for(int i=0;i<num;i++) {
			double w= sc.nextDouble();
			double l= sc.nextDouble();
			area +=w*l;
			
		}
		System.out.println(area*c);

	}

}
