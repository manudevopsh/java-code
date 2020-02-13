import java.util.Scanner;
public class HissingMicrophone {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char [] input=sc.next().toCharArray();
		for(int i=0;i<input.length-1;i++) {
			if((input[i]=='s')&(input[i+1]=='s')) {
				System.out.println("hiss");
				System.exit(0);
			}
		}
		System.out.println("no hiss");
	}

}
