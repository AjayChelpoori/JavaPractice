package javaPractice;

public class FibonacciSeries {
    public static void main(String[] args){
        int n = 12;
        Fibonacci(n);
    }
    public static void Fibonacci(int n){
        int  num1=0, num2=1;
        for (int i =0; i < n; i++){
            System.out.print(num1+" ");
            int num3 = num1 + num2 ;
            num1 = num2;
            num2 = num3;

        }
    }
}
