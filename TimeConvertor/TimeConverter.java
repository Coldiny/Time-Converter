
/**
 * Programers: Christian Kyle H. De Paz & Rey Emmanuel G. Jadraque
 * Grade and Section: 10-St.Nicholas
 * Date coded: 3/15/2022
 */
import java.util.Scanner;

public class TimeConverter{
  public static void tm() throws InterruptedException {
    Scanner scan = new Scanner(System.in);
    double choice, a;
    boolean stop = true;
    char answer;
   
    while(stop) {

  
      System.out.println("==========================");
      System.out.println("Welcome to Time Converter");
      System.out.println("==========================");
      System.out.println("[1] --> Seconds to Minutes");
      System.out.println("[2] --> Seconds to Hours");
      System.out.println("[3] --> Seconds to Days");
      System.out.println("[4] --> Minutes to Seconds");
      System.out.println("[5] --> Minutes to Hours");
      System.out.println("[6] --> Minutes to Days");
      System.out.println("[7] --> Hours to Seconds");
      System.out.println("[8] --> Hours to Minutes");
      System.out.println("[9] --> Hours to Days");
      System.out.println("[10] -> Exit Program");
      System.out.println("--------------------------");
      System.out.print("Enter a number from above: ");
      choice = scan.nextInt();
  
      if (choice == 1) {
        SM.SecondMinute();

      }
      else if (choice == 2) {
        SH.SecondHour();

      } 
      else if (choice == 3) {
        SD.SecondDay();

      } 
      else if (choice == 4) {
        MS.MinuteSecond();

      } 
      else if (choice == 5) {
        MH.MinuteHour();

      } 
      else if (choice == 6) {
        MD.MinuteDay();

      } 
      else if (choice == 7) {
        HS.HourSecond();

      } 
      else if (choice == 8) {
        HM.HourMinute();

      } 
      else if (choice == 9) {
        HD.HourDay();

      } 
      else if (choice == 10){
        System.out.println("\nThank you for using our program hope you enjoyed!");
        break;
      
      } 
      else {
        System.out.println("Reset the program and type one of the given numbers above."); 
      }
      Thread.sleep(1500);
          System.out.println("Do you want to continue? (y/n)");
          answer = scan.next().charAt(0);
          String s = scan.nextLine();
          if (answer == 'y') {
          System.out.println("Restarting the program...");
          Thread.sleep(2000);
       
          }else if(answer == 'n'){
          System.out.println("Thank you for using our program hope you enjoyed!");
          break;
          
          }else {
          System.out.println("Invalid input!!");
          break;
      }
  
          
    }
   }
}