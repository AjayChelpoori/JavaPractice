package javaProgramPractice.chars;

public class FindCharCount {
    public static void main(String[] args){
        String str = "Check the occurence of a char in give string";
        char ch = 'o';
        int count = 0;
        for(int i =0; i<str.length(); i++){
            if(str.charAt(i) == ch){
                count++;
            }
        }
        System.out.print(count);
    }
}
