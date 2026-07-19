package Week2.Day6;

public class MaxMinArray {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        System.out.println("Max:"+(max(arr)));
        System.out.println("Min:"+(min(arr)));
    }
    public static int max(int[] arr){
        int max = arr[0];
        for(int i = 1;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
    public static int min(int[] arr){
        int min = arr[0];
        for(int i = 1;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        return min;
    }
}
