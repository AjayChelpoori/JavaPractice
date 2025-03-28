package javaLearning;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;

public class ReadingFileUsingBufferReader {
    public static void main(String[] args) throws Exception {

        BufferedReader bRead = new BufferedReader(new InputStreamReader(System.in));
//        System.out.print("Enter the path : ");
        String path = "C:\\Users\\AYATEESH\\IdeaProjects\\Selenium\\src\\main\\java\\javaLearning\\file.txt";

        String fileRead = Files.readString(Path.of(path));
        System.out.println(fileRead);

        BufferedReader bFile = new BufferedReader(new FileReader(path));

        String st;
        while ((st = bFile.readLine()) != null){
            if (!(st.charAt(1) == 'r' || st.charAt(1) == 'f')){
                String tempString = st.substring(3,15);
                System.out.println(tempString);
            }
        }

    }
}
