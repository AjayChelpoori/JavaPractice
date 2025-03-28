package practice;

public class ReverseWords {
    public static void main(String[] args){
        String sentence = "Java is a programming language";
        System.out.println(sentence);
        System.out.print(reverseEachWord(sentence));
    }
    public static String reverseEachWord(String sentence){
        String[] words = sentence.split(" ");
        String results = "";
        for (String word: words
             ) {
            String reverseWords = "";
            for(int i= word.length()-1; i >= 0 ; i--){
                reverseWords += word.charAt(i);
            }
            results += reverseWords+" ";
        }
        return results.trim();
    }
}
