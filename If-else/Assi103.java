import java.lang.classfile.instruction.SwitchCase;

public class Assi103 {
    public static void main(String args[]){
        int year = 2024;
       boolean leap = (year%4==0 && year%400==0 && year%100!=0);

        System.out.println(leap);

    }
}
