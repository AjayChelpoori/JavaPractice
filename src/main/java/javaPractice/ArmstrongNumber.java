package javaPractice;

public class ArmstrongNumber {
    public static void main(String[] args){
        int number = 153;
        int original = number;
        int sum = 0;
        while (number>0){
            int digit = number %10;
            sum += digit*digit*digit;
            number /=10;
        }
        if(original == sum){
            System.out.print(original+" is a amstrongnumber");
        }else {
            System.out.print(original+" is not a amstrongnumber");
        }
    }
}
