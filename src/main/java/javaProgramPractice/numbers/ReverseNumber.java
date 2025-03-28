package javaProgramPractice.numbers;

public class ReverseNumber {
    public static void main(String[] args){
        int number =12345;
        int reverseNum = 0;
        while(number >0){
            int digit = number % 10;
            reverseNum = reverseNum * 10 + digit;
            number /= 10;
        }
        System.out.print(reverseNum);

    }
}
