package practice;

public class ArmstrongNumber {
    public static void main(String[] args){
        int number = 153;
        int sum = 1;
        int original = number;
        while(number > 0){
            int digit = number % 10;
            sum += digit*digit*digit;
            number /= 10;
        }
        if(original == sum){
            System.out.println(original+" is a armstrong number");
        }else{
            System.out.println(original+" is  not a armstrong number");
        }
    }
}
