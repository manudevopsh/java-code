import java.util.Scanner;

public class Greetings {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input=sc.nextLine();
		int count=0;
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<input.length();i++) {
			if(input.charAt(i)=='e') {
				sb.append(input.charAt(i));
				sb.append(input.charAt(i));
				count++;
			}else {
				sb.append(input.charAt(i));
			}
		}
		System.out.println(sb);
		
		
		

	}

}
