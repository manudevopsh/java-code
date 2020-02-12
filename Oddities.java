import java.util.Scanner;
public class Oddities
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    int n = sc.nextInt ();
    int[] item = new int[20];
    for (int i = 0; i < n; i++)
      {
    item[i] = sc.nextInt ();
      }
    for (int i = 0; i < n; i++)
      {
    if (item[i] % 2 == 0)
      {
        System.out.println (item[i] + " is even");
      }
    else
      {
        System.out.println (item[i] + " is odd");
      }
      }
  }

}

