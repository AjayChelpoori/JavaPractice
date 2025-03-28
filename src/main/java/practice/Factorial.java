package practice;

public class Factorial {
    public static void main(String[] args){
        int number = 5;
        long fact = 1;
        for(int i =number; i>0; i--){
            fact *= i;
        }
        System.out.print(fact);
    }
}
