package Week_6_Files_and_Expeption;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class HelloWriting {
    public static void main(String[] args)throws IOException {

        // file will be created if it does not exist.
        // file will be overwritten if it does exist!
        FileWriter writer = new FileWriter("hello.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(writer);

        // Store data.
        bufferedWriter.write("Hello!\n");
        bufferedWriter.write("More data here\n");
        bufferedWriter.write("Goodbye!\n");

        bufferedWriter.close(); // close the file.

        // This FileWriter constructor appends to the existing file.
        FileWriter writer2 = new FileWriter("hello.txt", true);
        BufferedWriter bufferedWriter2 = new BufferedWriter(writer2);

        // Store data
        bufferedWriter2.write("Other data!");
        bufferedWriter2.newLine();  // create new line.
        bufferedWriter2.write("Hello programmers");
        bufferedWriter2.newLine();  // create new line.
        bufferedWriter2.write("End of the file!");
        bufferedWriter2.newLine();  // create new line.

        bufferedWriter2.close();
    }
}
