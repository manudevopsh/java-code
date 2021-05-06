import java.util.Scanner;

public class Pet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int points[][]= new int[5][5];
		int sum[]=new int[5];
		int max=0;
         for (int i = 0; i < 5; i++)
         {
        	 sum[i]=0;
             for (int j = 0; j < 4; j++)
             {
            	 points[i][j] = sc.nextInt();
                 sum[i]+=points[i][j];
             }
         }
         max=sum[0];
         int winner=1;
         for (int i = 1; i < 5; i++)
         {
        	 if(max<sum[i]) {
        		 max=sum[i];
        		 winner=i+1;
        	 }
        	 
         }
         System.out.println(winner+" "+max);

}
}
