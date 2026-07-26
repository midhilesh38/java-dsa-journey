package Week3.Day13;
import java.util.HashSet;
public class HashSetProgram {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,2,5};
        int[] arr2 = {3,4,5,6,7};
        System.out.println("Array 1 Have Duplicate:"+hasDuplicate(arr1));
        System.out.println("Array 2 Have Duplicate:"+hasDuplicate(arr2));

    }
    public static boolean hasDuplicate(int[] arr){
        HashSet<Integer> seen = new HashSet<>();
        for(int num : arr){
            if(seen.contains(num)){
                return true;
            }
            seen.add(num);
        }
        return false;
    }
}
