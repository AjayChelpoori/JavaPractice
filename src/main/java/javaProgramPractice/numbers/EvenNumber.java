package javaProgramPractice.numbers;

public class EvenNumber {
    public static void main(String[] args){

        int number = 21;
        System.out.print("Print even numbers from 1-"+number+" : ");
        for(int i=2; i<=number; i+=2){
            System.out.print(i+" ");
        }
    }
}
