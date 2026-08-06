package Week3.Day15;
import java.util.PriorityQueue;
import java.util.Arrays;
public class PriorityQueueProgram {
    public static void main(String[] args) {
        int[] arr = {45, 12, 8, 33, 5, 19, 27};
        int[] result = threeSmallest(arr);
        System.out.println(Arrays.toString(result));
    }
    public static int[] threeSmallest(int[] arr){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int num : arr){
            pq.offer(num);
        }
        int[] result = new int[3];
        for(int i =0 ;i<3;i++) {
            result[i] = pq.poll();
        }
        return result;
    }

}

