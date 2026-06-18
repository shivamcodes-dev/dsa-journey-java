import java.util.Scanner;

public class Ch0803 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Encome in lakhs : ");
        int income = sc.nextInt();
        float tax = 0;

        if(income < 5){
            System.out.println("You are NOT eligible to pay tax:)");
        }
        else if(income > 5 || income < 10){
            tax = income * 0.20f * 100000;
            //income -= tax;
            System.out.println("Your Tax is "+ tax);
            //System.out.println("Your Remain ammount is " + income);
        } else {
            tax = income * tax * 100000;
        }


    }
}
