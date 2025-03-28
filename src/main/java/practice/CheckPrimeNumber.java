package practice;

public class CheckPrimeNumber {

    public static void main(String[] args){

        int primeNumber = 7;
        for (int i=2; i<=primeNumber/2; i++){
            if(primeNumber % i == 0){
                System.out.println(primeNumber+" is not a prime number");
            }
        } System.out.println(primeNumber+" is  a prime number");
    }
}
