import java.util.Scanner;
public class cold {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] t = new int[100];
		int count=0;
		for(int i=0;i<n;i++) {
			t[i]= sc.nextInt();
			if(t[i]<0) {
				count++;
			}
		}
		System.out.println(count);
	}

}
