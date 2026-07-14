package Week1.Day1;
import java.util.Scanner;
public class Temperature {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose Conversation");
        System.out.println("1.Celsius to Fahrenheit");
        System.out.println("2.Fahrenheit to Celsius");
        System.out.print("Enter your choice (1 or 2):");
        int choice = sc.nextInt();
        if(choice == 1) {
            System.out.print("Enter Celsius:");
            double c = sc.nextDouble();
            double f = (c * 9 / 5) + 32;
            System.out.println("Fahrenheit value:" + f);
        }else if(choice==2) {
            System.out.print("Enter Fahrenheit:");
            double f = sc.nextDouble();
            double c = (f - 32) * 5/9;
            System.out.println("Celsius value:"+c);
        }
    }
}
