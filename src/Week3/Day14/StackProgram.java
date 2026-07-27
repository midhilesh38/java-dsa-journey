package Week3.Day14;
import java.lang.reflect.Array;
import java.util.ArrayDeque;
public class StackProgram {
    public static void main(String[] args) {
        System.out.println("{[()]} "+isValid("{[()]}"));
        System.out.println("{[}] "+isValid("{[}]"));
        System.out.println("(( "+isValid("(("));
    }
    public static boolean isValid(String s){
        ArrayDeque<Character> stack = new ArrayDeque<>();
        for(char ch : s.toCharArray()){
            if(ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            }else{
                if(stack.isEmpty()){
                    return false;
                }
                char top = stack.pop();
                if(ch == ')' && top != '(') return false;
                if(ch == '}' && top != '{') return false;
                if(ch == ']' && top != '[') return false;
            }


        }
        return stack.isEmpty();
    }

}
