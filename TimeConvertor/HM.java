import java.util.Scanner;
public class HM {
  public static void HourMinute() throws InterruptedException {
  Scanner scan = new Scanner(System.in);
  double a;
    System.out.print("Enter value in hours: ");
    a = scan.nextDouble();
    System.out.println();
    System.out.println("Calculating...");
    Thread.sleep(1000);
    System.out.println(a * 60 + " minute/s" + a%60 + " second/s");
  }
}