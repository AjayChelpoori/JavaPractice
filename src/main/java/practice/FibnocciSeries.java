package practice;

public class FibnocciSeries {
    public static void fib(int number){
        int num1 =0, num2 =1, temp;
        for (int i =1; i<=number; i++){
            System.out.print(num1+",");
            temp = num1 + num2;
            num1 = num2;
            num2 = temp;
        }
    }
    public static void main(String[] args){
        int num = 16;
        fib(num);
        System.out.println("using main method");
        int num1 =0, num2 =1, temp;
        System.out.print(num1+" "+num2+" ");
        for (int i = 2; i<num; i++){

            temp = num1 + num2;
            System.out.print(temp+" ");
            num1 = num2;
            num2 = temp;
        }

    }
}
