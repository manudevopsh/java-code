import java.util.Scanner;

public class TransitWoes {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int s=sc.nextInt();
		int t=sc.nextInt();
		int n=sc.nextInt();
		int totaltime=0;
		int[] walkingtime=new int[n+1];
		int[] travellingtime= new int[n];
		int[] busarrivingtime= new int[n];
		for(int i=0;i<=n;i++) {
			walkingtime[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			travellingtime[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			busarrivingtime[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			totaltime+=walkingtime[i];
			int waitingtime=0;
			if(totaltime%busarrivingtime[i]>0) {
				 waitingtime=busarrivingtime[i]-totaltime%busarrivingtime[i];
			}else {
				waitingtime=0;
			}
			totaltime+=waitingtime+travellingtime[i];			
		}
		totaltime+=walkingtime[n];
		if((t-s)>=totaltime) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
	}
}
