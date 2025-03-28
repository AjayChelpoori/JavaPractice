package javaProgramPractice.chars;

public class CheckVowels {
    public static void main(String[] args){
        String input = "Java Selenium";
        int count = 0;
        char ch ;
        for(int i=0 ; i<input.length(); i++){
            ch = input.charAt(i);
            if(ch == 'a'|| ch == 'e'|| ch == 'i'|| ch == 'o'|| ch == 'u'|| ch == 'A'|| ch == 'E'||ch == 'I'||ch == 'O'||ch == 'U'){
                count++;
            }
        }
        System.out.print(count);
    }
}
