package practice;

public class PrimeNumbers {

    public static boolean isPrime(int number){
        for(int i= 2;i<=number/2;i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
    public static boolean checkPrimeNumbers(int num){
        if(num <= 1) return false;
        for(int i =2; i<=num/2; i++){
            if(num % i == 0){
                return false;
            }
        } return true;
    }
    public static void main(String[] args){
        int number = 37;
       if(isPrime(number)){
           System.out.println(number+" is a prime number");
       }else{
           System.out.println(number+" is not a prime number");
       }
        int num = 67;
        System.out.println("checking prime numbers from 0-"+number);
       for(int i =0; i<=number; i++){
           if(isPrime(i)){
               System.out.print(i+",");
           }
       }
    }
}
