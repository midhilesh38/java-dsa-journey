package Week3.Day12;
import java.util.HashMap;
public class HashMapProgram {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        String sentence = "the quick brown fox the lazy dog the fox";
        String[] arrSentence = sentence.split(" ");
        for(String word : arrSentence){
            map.put(word,map.getOrDefault(word,0)+1);
        }
        for(String key : map.keySet()){
            System.out.println(key+" : "+map.get(key));
        }
    }
}
