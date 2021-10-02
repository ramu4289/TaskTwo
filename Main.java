//import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {

    public static void pathDir(String newPath) throws IOException  {

        Path path = Paths.get(newPath);

        Path filename = path.getFileName();

        //PrintStream fileName = (PrintStream) path.getFileName(); //System.out.format("getFileName: %s%n", path.getFileName());

        
        try (BufferedReader fileReader = new BufferedReader(new FileReader(filename.toString()))) {
            
            StringBuilder sb = new StringBuilder();
            
            String line = fileReader.readLine();
            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = fileReader.readLine();
                System.out.println(line);
            }
            String newString = sb.toString();

            // for (int i = 0; i < newString.length(); i ++) {
            //     char temp = newString[0];

            // }
            System.out.println(newString);
        }
        
        System.out.println("Your file name is: " + filename);

    }

    public static void main(String[] args) throws IOException {

        System.out.println("Enter file path: ");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        pathDir(input);
        scan.close();

        
    }
}