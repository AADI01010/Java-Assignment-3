package Section1;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class BufferedWriterExample {
    public static void main(String[] args) {
        String fileName = "example.txt"; // File to write to
        String content = "Hello, this is a buffered character stream file.\n"
                + "BufferedWriter writes data efficiently.\n"
                + "Enjoy Java programming with Buffered I/O!";

        // Writing to the file using BufferedWriter
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            bw.write(content); // Write content
            bw.newLine(); // Add a new line
            System.out.println("File written successfully using BufferedWriter.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}
