package Test4_16Sep2022;

import java.io.CharArrayWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WritingToMultipleFiles {
    public static void main(String[] args) throws IOException {

        FileWriter fileWriter1 = new FileWriter("a1.txt");
        FileWriter fileWriter2 = new FileWriter("b1.txt");
        FileWriter fileWriter3 = new FileWriter("c2.txt");
        FileWriter fileWriter4 = new FileWriter("d2.txt");

        FileReader fileReader = new FileReader("combined.txt");

        CharArrayWriter charArrayWriter = new CharArrayWriter();

        String answer = "";

        int i;
        while((i=fileReader.read())!=-1) {
            answer += (char) i ;
        }

        charArrayWriter.write(answer);
        charArrayWriter.writeTo(fileWriter1);
        charArrayWriter.writeTo(fileWriter2);
        charArrayWriter.writeTo(fileWriter3);
        charArrayWriter.writeTo(fileWriter4);

        fileReader.close();
        fileWriter1.close();
        fileWriter2.close();
        fileWriter3.close();
        fileWriter4.close();
        charArrayWriter.close();


    }
}
