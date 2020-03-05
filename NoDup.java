import java.util.Scanner;
public class NoDup {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input=sc.nextLine();
		boolean dup=false;
		String words[]=input.split(" ");
		for(int i=0;i<words.length;i++) {
			for(int j=i+1;j<words.length;j++) {
				if(words[i].equals(words[j])) {
					dup=true;
				}
			}
		}
		if(dup==true) {
			System.out.println("no");
		}else
			System.out.println("yes");

	}

}
