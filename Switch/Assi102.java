package Switch;
import java.util.*;

public class Assi102 {
    public static void main(String args[]){
   /* Write a Java program to input week number(1-7) and print day of week name 
using switch case. */
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Week no.(1-7): ");
    int day = sc.nextInt();
    switch(day) {
        case 1 : System.out.print("Mon");
                        break;
        case 2 : System.out.print("Tue");
                       break;
        case 3 : System.out.print("Wed");
                       break;
        case 4 : System.out.print("Thu");
                       break;
        case 5 : System.out.print("Fri");
                       break;
        case 6 : System.out.print("Sat");
                       break;
        case 7 : System.out.print("Sun");
                       break;
        default : System.out.println("Enter a valid Day:)");
    }

    }
}
