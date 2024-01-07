import java.util.Scanner;
public class HS {
  public static void HourSecond() throws InterruptedException {
  Scanner scan = new Scanner(System.in);
  int a;
    System.out.print("Enter value in hours: ");
    a = scan.nextInt();
    System.out.println();
    System.out.println("Calculating...");
    Thread.sleep(1000);
    System.out.println(a * 3600 + " second/s");
 }
}