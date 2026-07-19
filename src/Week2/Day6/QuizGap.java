package Week2.Day6;

import java.sql.SQLOutput;

public class QuizGap {
    public static void main(String[] args) {
        int[] arr = {5, 12, 8, 3, 19};
        for(int i= arr.length-1;i>=0;i--){  //i have missed the i>0 instead of i>=0
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i : arr){
            i = i * 2;             //here using for each loop it only change on the temporary not in original
            System.out.print(i+" ");
        }
        System.out.println();
        for(int i = 0 ;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
