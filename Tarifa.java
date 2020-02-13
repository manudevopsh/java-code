import java.util.Scanner;
public class Tarifa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int n = sc.nextInt();
		int [] month= new int[100];
		int result=0;
		for(int i = 0;i<n;i++) {
			month[i]=sc.nextInt();
			result+=x-month[i];
		}
		System.out.println(result+x);

	}

}
