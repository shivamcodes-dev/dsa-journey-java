import java.util.Scanner;

public class Ch0805 {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your marks: ");
    int marks = sc.nextInt();
    String result = (marks>=33)? "Pass" : "fail";
    System.out.println(result);
    }
}
