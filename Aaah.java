import java.util.Scanner;

public class Aaah {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ip1 = sc.nextLine();
		String ip2= sc.nextLine();
		int count1=0;
		for(int i=0;i<ip1.length();i++) {
			if(ip1.charAt(i)=='a') {
				count1++;
			}
		}
		int count2=0;
		for(int i=0;i<ip2.length();i++) {
			if(ip2.charAt(i)=='a') {
				count2++;
			}
		}
		if(count1>=count2) {
			System.out.println("go");
		}else {
			System.out.println("no");
		}
	}

}
