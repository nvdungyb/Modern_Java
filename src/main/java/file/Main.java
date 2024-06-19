package file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static String processFile(String filePath, BufferedReaderProcessor readerProcessor) throws FileNotFoundException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            return (String) readerProcessor.process(reader);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static Integer getTotalLines(String filePath, BufferedReaderProcessor readerProcessor) throws FileNotFoundException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            return (Integer) readerProcessor.process(reader);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        String filePath = "C:\\Users\\acer\\OneDrive - ptit.edu.vn\\Desktop\\Modern Java\\Learn_Modern_Java\\src\\main\\java\\file\\file.txt";

        String readByLines = processFile(filePath, (BufferedReader reader) -> {
            StringBuilder builder = new StringBuilder();
            builder.append(reader.readLine());
            builder.append("\n");
            builder.append(reader.readLine());
            builder.append("\n");
            builder.append("This is the end of file!");

            return builder.toString();
        });

        Integer readLines = getTotalLines(filePath, (BufferedReader reader) -> {
            Integer lines = 0;
            while (reader.readLine() != null) {
                lines++;
            }
            return lines;
        });

        System.out.println(readByLines);
        System.out.println(readLines);
    }
}
