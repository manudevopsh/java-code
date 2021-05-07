import java.util.Scanner;

public class HarshadNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum=sumofDigit(n);
		
		while(n%sum!=0) {
			n++;
			sum=sumofDigit(n);
		}
		System.out.println(n);
	}
	public static int sumofDigit(int n)
    {
        int result = 0;
        while (n != 0)
        {
            result+= n % 10;
            n = n / 10;
        }
        return result;
    }


}
