import java.util.Scanner;
public class SH {
  public static void SecondHour() throws InterruptedException {
  Scanner scan = new Scanner(System.in);
  int a;
    System.out.print("Enter value in seconds: ");
    a = scan.nextInt();
    System.out.println();
    System.out.println("Calculating...");
    Thread.sleep(1000);
    System.out.println(a / 3600 + " hour/s" + a%3600 + " minute/s");

  }
}