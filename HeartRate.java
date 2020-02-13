import java.util.Scanner;
public class HeartRate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		float result1, result2, result3;
		for(int i =0;i<n;i++) {
			int b= sc.nextInt();
			float p=sc.nextFloat();
			result1= (b-1)*(60/p);
			result2= (b)*(60/p);
			result3= (b+1)*(60/p);
			System.out.println(result1+" "+result2+" "+result3);
		}
	}
}
