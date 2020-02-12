import java.util.ArrayList;
import java.util.Scanner;
public class Datum {
    static ArrayList<String> days = new ArrayList<>();
    static int monthfirstday;
    public static void main(String[] args) {
    	Scanner sc= new Scanner(System.in);
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");
        days.add("Sunday");
        int day = sc.nextInt();
        int month = sc.nextInt();
        String res = calcDay(day, month);
        System.out.println(res);
    }
    public static String calcDay(int day, int month){
        switch(month){
            case 1: monthfirstday = 3;break;
            case 2: monthfirstday = 6;break;
            case 3: monthfirstday = 6;break;
            case 4: monthfirstday = 2;break;
            case 5: monthfirstday = 4;break;
            case 6: monthfirstday = 0;break;
            case 7: monthfirstday = 2;break;
            case 8: monthfirstday = 5;break;
            case 9: monthfirstday = 1;break;
            case 10: monthfirstday = 3;break;
            case 11: monthfirstday = 6;break;
            case 12: monthfirstday = 1;break;
        }
        return days.get(((monthfirstday - 1)+day)%7);
    }
}