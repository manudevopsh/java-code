import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String input=sc.nextLine();
		String[] part=input.split("[;]");
		int count=0;
		for(int i=0;i<part.length;i++) {
			if(part[i].contains("-")) {
				String[] subPart=part[i].split("-");
				int num1 = Integer.parseInt(String.valueOf(subPart[0]));
				int num2 = Integer.parseInt(String.valueOf(subPart[1]));
				count=count+num2-num1+1;
			}else {
				count++;
			}
		}
		System.out.println(count);

	}

}
