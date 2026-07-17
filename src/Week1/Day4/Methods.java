package Week1.Day4;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = sc.nextInt();
        System.out.println("Factorial of "+n+" is "+(factorial(n)));
        System.out.println("Reverse of "+n+" is "+(reverseNumber(n)));
        if(isPalindrome(n)){
            System.out.println(n+" is a palindrome");
        }else{
            System.out.println("Not a palindrome");
        }
    }
    public static int factorial(int n){
        int fact = 1;
        for(int i = 1; i<=n ; i++){
            fact = fact * i;
        }
        return fact;
    }
    public static int reverseNumber(int n){
        int rev = 0;
        while(n>0){
            int lastDigit = n%10;
            rev = rev * 10 + lastDigit;
            n/=10;
        }
        return rev;
    }
    public static boolean isPalindrome(int n){
        int rev = reverseNumber(n);
        return n == rev;
    }
}
