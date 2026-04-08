import java.util.Scanner;

public class Ch0806 {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter First No. ");
    int a = sc.nextInt();
    System.out.print("Enter Opeartion( +, -, *, /, ). ");
    char op = sc.next().charAt(0);
    System.out.print("Enter Second No. ");
    int b = sc.nextInt();

    switch (op) {
        case '+' :System.out.println(a+b);
            
            break;
        case '-' :System.out.println(a-b);
            
            break;
        case '*' :System.out.println(a*b);
            
            break;
        case '/' :System.out.println(a/b);
            
            break;
    
        default:System.out.println("Enter a valid operation :)");
        
    }

    }
}
