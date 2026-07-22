package Week2.Day9;


public class StringArray {
    public static void main(String[] args) {
        System.out.println("Reverse String:"+reverseString("DSA70days"));
        System.out.println("Count Vowel:"+countVowels("ajdlfajkALJDFLDLKFJ"));
        System.out.println("Palindrome or not:"+isPalindrome("PalaP"));
    }
    public static String reverseString(String s){
        char[] chars = s.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        while(left<right){
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;

        }
        return new String(chars);
    }
    public static int countVowels(String s){
        int count = 0;
        for(int i = 0;i<s.length();i++){
            char c = Character.toLowerCase(s.charAt(i));
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                count++;
            }
        }
        return count;
    }
    public static boolean isPalindrome(String s){
        return s.equals(reverseString(s));
    }
}
