import java.util.Scanner;
public class MD {
  public static void MinuteDay() throws InterruptedException {
  Scanner scan = new Scanner(System.in);
  int a;
    System.out.print("Enter value in minutes: ");
    a = scan.nextInt();
    System.out.println();
    System.out.println("Calculating...");
    Thread.sleep(1000);
    System.out.println(a / 1440 + " day/s" + a%1440 + " hour/s");
 }
}