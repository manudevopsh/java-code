import java.util.Scanner;
import java.math.*;
public class Pot {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num= sc.nextInt();
		int []n = new int[10];
		int result=0;
		for(int i=0;i<num;i++) {
			n[i]=sc.nextInt();
			int number=n[i]/10;
			int power=n[i]%10;
			result+=Math.pow(number, power);
		}
		System.out.println(result);
	}

}
