import java.util.Scanner;
public class SM {
  public static void SecondMinute() throws InterruptedException {
  Scanner scan = new Scanner(System.in);
  int a;

    System.out.print("Enter value in seconds: ");
    a = scan.nextInt();
    System.out.println();
    System.out.println("Calculating...");
    Thread.sleep(1000);
    System.out.println(a/60 + " minute/s and " + a%60 + " second/s");
  
 }
}