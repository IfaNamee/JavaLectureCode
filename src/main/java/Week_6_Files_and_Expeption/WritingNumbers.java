package Week_6_Files_and_Expeption;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WritingNumbers {
    public static void main(String[] args) throws IOException {

        int data1 = 67;
        int data2 = 65;
        int data3 = 84;

        double number = 12.34;

        FileWriter writer = new FileWriter("numbers.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(writer);

        // To print originally number add "\n" new line print number.
        bufferedWriter.write(data1 + "\n");
        bufferedWriter.write(data2 + "\n");
        bufferedWriter.write(data3 + "\n");

        bufferedWriter.write(((double) number) + "\n");
        bufferedWriter.write("test");

        bufferedWriter.close();
    }
}
