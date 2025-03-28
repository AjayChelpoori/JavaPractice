package practice;

public class Prime {
    public static boolean isPrime(int num){

        for(int i=2;i<=num/2; i++){
            if(num % i == 0){
                return false;
            }
        } return true;
    }
    public static void main(String[] args){
        int num = 45;
       if( isPrime(num)){
            System.out.println(num+" is a prime number");
        } else {
           System.out.println(num+" is not  a prime number");
       } System.out.println("Printing prime numbers upto: "+num);
        for(int i =2; i<=num; i++){
            if (isPrime(i)){
                System.out.print(i+",");
            }
        }
    }
}
