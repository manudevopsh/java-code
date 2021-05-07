import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class ICPCAwards {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		StringBuilder sb = new StringBuilder(sc.nextLine());
        HashSet<String> set = new HashSet<>();
        for(int i = 0; i < n && set.size() < 12; i++){
            String[] line = sc.nextLine().split(" ");
            if(set.add(line[0]))
                sb.append(line[0] + " " + line[1] + System.lineSeparator());
        }
        System.out.println(sb);

	}

}
