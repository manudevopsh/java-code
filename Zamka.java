import java.util.Scanner;

public class Zamka {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 int l = sc.nextInt();
         int d = sc.nextInt();
         int x = sc.nextInt();
         for(int i = l; i <= d; i++)
         {
             if (sumofDigit(i) == x)
             {
                 System.out.println(i);
                 break;
             }
         }
         for(int i = d; i >= l; i--)
         {
             if (sumofDigit(i) == x)
             {
            	 System.out.println(i);
                 break;
             }
         }
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


