import java.util.Scanner;
public class Filip {
	public static int revert(int n ) {
		int reversed=0;
		for(;n!=0;n/=10) {
			int digit=n%10;
			reversed=reversed*10+digit;
		}
		return reversed;
		
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a= sc.nextInt();
		int b= sc.nextInt();
		if((a%10)>(b%10)) {
			System.out.println(revert(a));
		}
		else if((b%10)>(a%10)) {
			System.out.println(revert(b));
		}
		else {
			if((a%100)>(b%100)) {
				System.out.println(revert(a));
			}
			else if((b%100)>(a%100)) {
				System.out.println(revert(b));
			}
		}
		
		
		

	}

}
