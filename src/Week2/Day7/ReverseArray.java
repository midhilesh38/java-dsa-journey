package Week2.Day7;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,3,4,5,6,6,7};
        int[] arr2 = {1,2,3,4,4,5,6,7,7,8};
        System.out.println(Arrays.toString(reverseInPlace(arr1)));
        System.out.println(reverseDuplicateFindIndex(arr1));
        System.out.println(Arrays.toString(removeDuplicateInArray(arr2)));
    }
    public static int[] reverseInPlace(int[] arr){
        int left = 0;
        int right = arr.length - 1;
        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right]= temp;
            left++;
            right--;
        }
        return arr;
    }
    public static int reverseDuplicateFindIndex(int[] arr){
        int writeIndex = 1;
        for(int i = 1;i<arr.length;i++){
            if(arr[i]!=arr[writeIndex - 1]){
                arr[writeIndex]=arr[i];
                writeIndex++;
            }
        }
        return writeIndex;
    }
    public static int[] removeDuplicateInArray(int[] arr){
        int count = reverseDuplicateFindIndex(arr);   // call it ONCE, save the answer
        int[] temp = new int[count];
        for(int i = 0; i < count; i++){
            temp[i] = arr[i];
        }
        return temp;
    }

}
