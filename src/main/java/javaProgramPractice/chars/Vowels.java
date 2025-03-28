package javaProgramPractice.chars;

public class Vowels {
    public static void main(String[] args){
        String input = "Ajay Chelpoori";
        char ch = 'a';
        int count = 0;
        for(int i=0; i<=input.length()-1;i++){
            ch = input.charAt(i);
            if(ch == 'a' ||ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u' ||ch == 'A' ||ch == 'E' ||ch == 'I' ||ch == 'O' ||ch == 'U'){
                count++;
            }
        } System.out.print(count);
    }
}
