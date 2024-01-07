import java.util.Scanner;
public class SD {
  public static void SecondDay() throws InterruptedException {
  Scanner scan = new Scanner(System.in);
  int a;
    System.out.print("Enter value in seconds: ");
    a = scan.nextInt();
    System.out.println();
    System.out.println("Calculating...");
    Thread.sleep(1000);
    System.out.println(a / 86400 + " day/s"+ a%86400 + " hour/s");
  }
}