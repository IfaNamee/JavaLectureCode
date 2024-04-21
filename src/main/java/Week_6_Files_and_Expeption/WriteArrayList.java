package Week_6_Files_and_Expeption;

import javax.imageio.IIOException;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteArrayList {
    public static void main(String[] args) throws IOException {

        String filename = "ITEC.txt";
        List<String> classNames = List.of("Java", "Web", "C#");
        List<Integer> classes = List.of(2545, 2460, 2505);

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filename));

        for (int i = 0; i < classNames.size(); i++) {
            String name = classNames.get(i);
            int code = classes.get(i);

            bufferedWriter.write(String.format("ITEC %d %s \n", code, name));
        }
        bufferedWriter.close();

        BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));

        List<String> classDescription = new ArrayList<>();

        String line = bufferedReader.readLine();

        while (line != null) {
            classDescription.add(line);
            line = bufferedReader.readLine();
        }

        System.out.println("End of file reached.");
        System.out.println(classDescription);
    }
}
