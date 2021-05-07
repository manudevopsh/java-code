//Every year, Pumpkin Pete comes up with a couple of different Jack-O�-Lantern ideas for his annual Halloween special. 
//He stacks them up on haystacks for everyone to enjoy and take pictures with. 
//To make sure that there�s a wide variety of displays, he wants to make sure many possible Jack-O�-Lanterns designs are available. 
//He has come up with many eye, nose, and mouth designs and would like to know how many unique designs are possible. 
//He needs your help to set up the displays before the special kicks off!
//Input
//
//The input consists of one line which contains three integers. The first, N
//, indicates the number of eye designs. The second, T, indicates the number of nose designs. The third, M
//, indicates the number of mouth designs.
//Output

//Output a single line containing the number of different possible Jack-O�-Lantern designs.
////https://open.kattis.com/problems/jackolanternjuxtaposition
import java.util.Scanner;

public class JackOLanternJuxtaposition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t = sc.nextInt();
		int m = sc.nextInt();
		System.out.println(n*t*m);

	}

}
