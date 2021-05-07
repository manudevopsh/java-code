import java.util.Scanner;
import java.util.HashMap;

public class Modulo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input[] = new int[10];
		int result[] = new int[10];
		for(int i=0;i<10;i++) {
			input[i]=sc.nextInt();
			result[i]=input[i]%42;
			
		}
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        for (int i = 0; i < result.length; i++) {
            hm.put(result[i], i);
        }
        System.out.println(hm.keySet().size());

	}

}
