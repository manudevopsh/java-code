import java.util.Scanner;
public class sibice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int w= sc.nextInt();
		int h= sc.nextInt();
		int [] a= new int[50];
		for(int i=0;i<n;i++) {
			a[i]= sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			if(a[i]<=Math.sqrt(w*w+h*h))
			{
				System.out.println("DA");
			}
			else {
				System.out.println("NE");
			}
		}

	}

}
