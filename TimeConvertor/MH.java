import java.util.Scanner;
public class MH {
  public static void MinuteHour() throws InterruptedException {
  Scanner scan = new Scanner(System.in);
  int a;
    System.out.print("Enter value in minutes: ");
    a = scan.nextInt();
    System.out.println();
    System.out.println("Calculating...");
    Thread.sleep(1000);
    System.out.println(a / 60 + " hour/s" + a%60 + " minute/s");
 }
}