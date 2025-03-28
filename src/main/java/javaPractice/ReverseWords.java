package javaPractice;

public class ReverseWords {
    public static void main(String[] args){
        String sentence = "Selenium is Powerfull automation tool in market";
        // muineleS si llufrewoP noitamotua loot ni tekram
        System.out.print(reverseEachWord(sentence));
    }
    public static String reverseEachWord(String sentence){
        String[] words = sentence.split(" ");
        String results = "";
        for (String word: words
             ) {
            String reversedWord = "";
            for(int i = word.length()-1; i>= 0; i--){
                reversedWord += word.charAt(i);
            }
            results += reversedWord+" ";
        }
        return results.trim();
    }
}
