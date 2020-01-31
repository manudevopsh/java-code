import java.util.Scanner;
public class Autori {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String input= sc.next();
		String output="";
		for(int i =0;i<input.length();i++) {
			if(Character.isUpperCase(input.charAt(i))) {
				output+=input.charAt(i);
			}
		}
		System.out.println(output);
	}
}
