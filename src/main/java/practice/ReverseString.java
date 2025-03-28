package practice;

public class ReverseString {
    public static void main(String[] args){

        String str = "Reverse a string using java program", reverse = "";
        StringBuilder stringReverse = new StringBuilder(str);
        stringReverse.reverse().toString();
        System.out.println(stringReverse);
        System.out.println("Reversing string using for loop");
        for(int i= str.length()-1; i>=0; i--){
            reverse += str.charAt(i);
        }
        System.out.println(reverse);

    }

}
