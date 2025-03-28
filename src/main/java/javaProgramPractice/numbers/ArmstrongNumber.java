package javaProgramPractice.numbers;

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

    public static class SwapTwoNumbers {
        public static void main(String[] args){

            int a=10 , b=8;
            System.out.println("before swap A = "+a+"; B = "+b);
            // sawpping two numbers
            a = a+b;
            b= a-b;
            a= a-b;
            System.out.println("after swap A = "+a+"; B = "+b);

        }


    }
}
