package javaPractice;

public class ReverseSentence {
    public static void main(String[] args){
    String input = " today is monday";
    System.out.print(reverseSentence(input));
    }
    public static String reverseSentence(String input){
        String[] words = input.split(" ");
        StringBuilder reverse = new StringBuilder();
        for(int i = words.length-1;i>=0; i--){
            reverse.append(words[i]).append(" ");
        }
        return reverse.toString().trim();
    }
}
