package Week2.Day10;

public class StringBuildingComparison {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        String result = "";
        for(int i = 0;i<100000;i++){
            result = result + "a";
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Time Taken(Traditional Method):"+(endTime-startTime)+"ms");
        startTime = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<100000;i++){
            sb.append("a");
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time Taken(String Builder Method):"+(endTime-startTime)+"ms");
    }
}
