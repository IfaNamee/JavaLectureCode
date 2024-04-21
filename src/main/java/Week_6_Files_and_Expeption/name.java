package Week_6_Files_and_Expeption;

import java.io.*;

public class name {
    public static void main(String[] args) throws IOException {

        String name = "Ifa";
        String color = "Green";
        int classCode = 2545;

        //     FileWriter writer = new FileWriter("Info.txt");
        //     BufferedWriter bufferedWriter = new BufferedWriter(writer);

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("Info.txt"));

        bufferedWriter.write("My name is " + name + "\n");
        bufferedWriter.write("My favorite color is " + color+ "\n");
        bufferedWriter.write("I\'m taking " + classCode+ "\n");

        bufferedWriter.close();

    //    FileReader reader = new FileReader("Info.txt");
    //    BufferedReader bufferedReader = new BufferedReader(reader);

        BufferedReader bufferedReader = new BufferedReader(new FileReader("Info.txt"));

        String line = bufferedReader.readLine();

        while (line != null){
            System.out.println(line);
            line = bufferedReader.readLine();
        }

        bufferedReader.close();
    }
}
