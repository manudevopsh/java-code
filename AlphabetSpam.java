import java.util.Scanner;

public class AlphabetSpam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int totalchar=input.length();
		int ws=0,lc=0,uc=0,s=0;
		for(int i=0;i<totalchar;i++) {
			char ch = input.charAt(i);
			if(ch=='_') {
				ws++;
			}else if(Character.isLowerCase(ch)) {
				lc++;
			}else if(Character.isUpperCase(ch)) {
				uc++;
			}else {
				s++;
			}
		}
		System.out.println(((float)ws/(float)totalchar));
		System.out.println((float)lc/(float)totalchar);
		System.out.println((float)uc/(float)totalchar);
		System.out.println((float)s/(float)totalchar);

	}

}
