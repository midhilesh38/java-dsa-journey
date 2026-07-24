package Week3.Day11;
import java.util.ArrayList;
public class ArrayListProgram {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1;i<=5;i++){
            list.add(i);
        }
        for(int i = 0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        System.out.println("Element at index 2:"+list.get(2));
        System.out.println("Before:"+list.size());
        list.remove(2);
        for(int i = 0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        System.out.println("After:"+list.size());
    }
}
