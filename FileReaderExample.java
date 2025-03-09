package Section1;
import java.io.FileReader;
import java.io.IOException;
public class FileReaderExample {
    public static void main(String[] args) {
        String fileName = "example.txt"; // File to read

        try (FileReader fr = new FileReader(fileName)) {
            int data;
            while ((data = fr.read()) != -1) { // Read character by character
                System.out.print((char) data); // Print each character
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
