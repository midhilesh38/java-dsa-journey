package Week2.Day6;

import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i = 0;i<5;i++){
            System.out.print("Enter value"+(i+1)+":");
            arr[i] = sc.nextInt();
        }
        System.out.println("Sum:"+(TotalOfArray(arr)));
    }
    public static int TotalOfArray(int[] arr){
        int sum = 0;
        for(int i : arr){
            sum+=i;
        }
        return sum;
    }
}
