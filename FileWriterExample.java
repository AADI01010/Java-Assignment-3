package Section1;
import java.io.FileWriter;
import java.io.IOException;
public class FileWriterExample {
    public static void main(String[] args) {
        String fileName = "example.txt"; // File to write to
        String content = "Hello, this is a character stream file.\n"
                + "FileWriter writes data as characters.\n"
                + "Enjoy Java programming!";
        // Writing to the file
        try (FileWriter fw = new FileWriter(fileName)) {
            fw.write(content); // Write the string to the file
            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}
