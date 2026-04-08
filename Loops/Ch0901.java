import java.util.Scanner;

public class Ch0901 {
    public static void main(String args[]) {
      /*   int num = 0;
        while (num<10) {
            System.out.println("Hello World "+num);
            num++;
        }*/

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no.: ");
        int num = sc.nextInt();
        int count = 1;
        while (count<=num) {
            System.out.println(count);
            count++;
        }

    }
}
