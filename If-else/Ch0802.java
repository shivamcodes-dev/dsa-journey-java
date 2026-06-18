
import java.util.Scanner;

public class Ch0802 {
    public static void main(String args[]){
        Scanner Shiv = new Scanner(System.in);
        System.out.print("Enter age : ");
        int age = Shiv.nextInt();

        if (age < 18){
            System.out.println("you are Minor:)");
        } else if(age>18 && age<40){
            System.out.println("You are select for drive ");
        } else{
            System.out.println("you are the select for PM");
        }




    }
}
