package javaProgramPractice.numbers;

public class PalindromeNumber {
    public static void main(String[] args) {

        int num = 121;
        int originalNum = num;
        int reversedNum = 0;
        while(num != 0){
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }
        if(originalNum == reversedNum){
            System.out.println(originalNum+" is a palindrome number");
        }else{
            System.out.println(originalNum+" is not a palindrome number");
        }

    }
}
