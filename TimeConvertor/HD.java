import java.util.*;
public class HD {
  public static void HourDay() throws InterruptedException {
  Scanner scan = new Scanner(System.in);
  double a;
    System.out.print("Enter value in hours: ");
    a = scan.nextDouble();
    System.out.println();
    System.out.println("Calculating...");
    Thread.sleep(1000);
    System.out.printf("%.0f", a / 24);
    System.out.print(" day/s ");
    System.out.printf("%.0f", a % 24);
    System.out.print(" hour/s\n");
 }
}