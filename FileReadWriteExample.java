package Section1;

import java.io.*;
public class FileReadWriteExample {
    public static void main(String[] args) {
        String fileName = "example.txt"; // File name
        // Step 1: Create and Write to File
        try (FileOutputStream fos = new FileOutputStream(fileName)) {
            String content = "Hello, this is a sample text file.\n"
                    + "It is used for reading with FileInputStream.\n"
                    + "Enjoy coding in Java!";
            fos.write(content.getBytes()); // Convert string to bytes and write
            System.out.println("File created and written successfully.\n");
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }

        // Step 2: Read File Using FileInputStream
        try (FileInputStream fis = new FileInputStream(fileName)) {
            int data;
            System.out.println("Reading file contents:");
            while ((data = fis.read()) != -1) { // Read byte-by-byte
                System.out.print((char) data);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
