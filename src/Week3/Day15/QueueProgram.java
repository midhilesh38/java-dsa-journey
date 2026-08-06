package Week3.Day15;
import java.util.LinkedList;
import java.util.Queue;
public class QueueProgram {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.offer(40);
        while(!q.isEmpty()){
            int value = q.poll();
            System.out.println(value);
        }
    }
}
