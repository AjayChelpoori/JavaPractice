package javaProgramPractice.strings;

public class ReverseString {
    public static void main(String[] args){
        String str = "Selenium Java";
        String reverse = "";
        StringBuilder reverseString = new StringBuilder(str);
        reverseString.reverse().toString();
        System.out.println(reverseString);

        for(int i= str.length()-1; i >=0; i--){
            reverse += str.charAt(i);
        }
        System.out.println("Reversed string using chatAT ");
        System.out.println(reverse);
    }
}
