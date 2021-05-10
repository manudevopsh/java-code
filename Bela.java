import java.util.Scanner;

public class Bela {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String b=sc.nextLine();
		int sum=0;
		for(int i=0;i<(n*4);i++) {
			String input=sc.nextLine();
			if(input.charAt(1)==b.charAt(1)) {
				sum=sum+Dominant(input.charAt(0));	
			}else {
				sum=sum+NonDominant(input.charAt(0));
			}
		}
		System.out.println(sum);
	}
		public static int Dominant(char num) {
			int result=0;
			switch(num) {
			  case 'A':
			    result+=11;
			    break;
			  case 'K':
				    result+=4;
				    break;
			  case 'Q':
				    result+=3;
				    break;
			  case 'J':
				    result+=20;
				    break;
			  case 'T':
				    result+=10;
				    break;
			  case '9':
				    result+=14;
				    break;
			  case '8':
				    result+=0;
				    break;
			  case '7':
				    result+=0;
				    break;
			  default: 
			}
			return result;
		}
		public static int NonDominant(char num) {
			int result=0;
			switch(num) {
			  case 'A':
			    result+=11;
			    break;
			  case 'K':
				    result+=4;
				    break;
			  case 'Q':
				    result+=3;
				    break;
			  case 'J':
				    result+=2;
				    break;
			  case 'T':
				    result+=10;
				    break;
			  case '9':
				    result+=0;
				    break;
			  case '8':
				    result+=0;
				    break;
			  case '7':
				    result+=0;
				    break; 
			  default:  
			}
			return result;
		}
	}


//https://open.kattis.com/problems/bela