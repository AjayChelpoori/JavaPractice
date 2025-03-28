package practice;

public class ReverseEachWord {
    public static void main(String[] args){
        String input = "Code Execution Successful";
        System.out.println(reverseWord(input));
    }
    public static String reverseWord(String input){
        String[] words = input.split(" ");
        String results =" ";
        for (String word: words
             ) {
            String reverse = " ";
            for(int i =word.length()-1; i>=0;i--){
                reverse += word.charAt(i);
            }
            results += reverse+" ";
        }
        return results.trim();
    }
}
