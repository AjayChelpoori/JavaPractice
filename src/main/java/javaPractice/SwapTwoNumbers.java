package javaPractice;

public class SwapTwoNumbers {
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
