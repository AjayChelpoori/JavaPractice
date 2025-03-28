package javaProgramPractice.strings;

public class PalindromeString {
    public static void main(String[] args){
        String str = "madam";
        String reverse ="";
        for(int i = str.length()-1; i>=0 ; i--){
            reverse += str.charAt(i);
        }
        if(str.equals(reverse)){
            System.out.print(reverse+" is a palindrome string");
        }else{
            System.out.print(reverse+" is not a palindrome string");
        }
    }
}
