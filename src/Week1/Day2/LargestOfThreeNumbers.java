package Week1.Day2;

import java.util.Scanner;

public class LargestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n1:");
        int a = sc.nextInt();
        System.out.print("Enter n2:");
        int b = sc.nextInt();
        System.out.print("Enter n3:");
        int c = sc.nextInt();
        int max = a;
        if(max<b){
            max=b;
        }
        if(max<c){
            max=c;
        }
        System.out.println(max);

    }
}
