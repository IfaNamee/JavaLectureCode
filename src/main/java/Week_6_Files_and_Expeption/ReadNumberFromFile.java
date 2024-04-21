package Week_6_Files_and_Expeption;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadNumberFromFile {
    public static void main(String[] args) throws IOException {

        List<Integer> numbers = new ArrayList<>();
        String fileName = "number.txt";

        BufferedReader reader = new BufferedReader(new FileReader(fileName));

        String line = reader.readLine();

        while (line != null) {
            int number = Integer.parseInt(line);
            numbers.add(number);
            line = reader.readLine();
        }
        System.out.println(numbers);
    }
}
