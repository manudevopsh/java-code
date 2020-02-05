import java.util.ArrayList;
import java.util.Scanner;
public class everywhere {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test= sc.nextInt();
		int[] t=new int[50];
		for(int i=0;i<test;i++) {
			t[i]=0;
			int cities= sc.nextInt();
			ArrayList<String> listofCities= new ArrayList<String>();
			for(int j=0;j<cities;j++) {
				String city=sc.next();
				if(!listofCities.contains(city)) {
					listofCities.add(city);
				}
			}
			t[i]=listofCities.size();
			
		}
		for(int i=0;i<(t.length);i++) {
			if(t[i]>0) {
				System.out.println(t[i]);
			}
		}

	}

}
