package Test4_16Sep2022;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class WritingToOneFile {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream1 = new FileInputStream("a.txt");
        FileInputStream fileInputStream2 = new FileInputStream("b.txt");
        FileInputStream fileInputStream3 = new FileInputStream("c.txt");
        FileInputStream fileInputStream4 = new FileInputStream("d.txt");

        FileWriter fileWriter = new FileWriter("combined.txt");

        Vector vector = new Vector();
        vector.add(fileInputStream1);
        vector.add(fileInputStream2);
        vector.add(fileInputStream3);
        vector.add(fileInputStream4);

        Enumeration enumeration = vector.elements();

        SequenceInputStream sequenceInputStream = new SequenceInputStream(enumeration);

        int i;
        while((i= sequenceInputStream.read())!=-1) {
            fileWriter.write((char)i);
            System.out.print((char)i);
        }

        fileInputStream1.close();
        fileInputStream2.close();
        fileInputStream3.close();
        fileInputStream4.close();
        fileWriter.close();
        sequenceInputStream.close();


    }
}
