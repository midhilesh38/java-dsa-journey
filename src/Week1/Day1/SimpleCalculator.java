package Week1.Day1;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Operator:");
        char op = sc.next().charAt(0);

        System.out.print("Enter value 1:");
        double a = sc.nextDouble();
        System.out.print("Enter value 2:");
        double b = sc.nextDouble();
        if(op == '+'){
            System.out.println(a+"+"+b+"="+(a+b));
        }else if(op == '-'){
            System.out.println(a+"-"+b+"="+(a-b));
        }else if(op == '*'){
            System.out.println(a+"x"+b+"="+(a*b));
        }else if(op == '/'){
            if(b!=0) {
                System.out.println(a + "/" + b + "=" + (a / b));
            }else{
                System.out.println("Invalid input");
            }
        }else if(op == '%'){
            if(b!=0) {
                System.out.println(a + "%" + b + "=" + (a % b));
            }else{
                System.out.println("Invalid input");
            }
        }
        else{
            System.out.println("Invalid operator");
        }

    }
}
