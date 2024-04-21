package Week_6_Files_and_Expeption;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class writingVariables {
    public static void main(String[] args) throws IOException {

        int classCode = 2454;
        double averageEnrollment = 22.16;
        String className = "Java";

        FileWriter writer = new FileWriter("java.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(writer);

        bufferedWriter.write("The class code is " + classCode + "\n");
        bufferedWriter.write("Class Name is " + className + "\n");
        bufferedWriter.write("The average enrollment is " + averageEnrollment + "\n");

        bufferedWriter.close();
        // writer.close // this is works too.

    }
}
