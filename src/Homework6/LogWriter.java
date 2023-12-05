package Homework6;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class LogWriter {

    public static void writeToLogFile(String logFilePath, String logLevel, String message) {
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = currentDateTime.format(formatter);


        String logEntry = String.format("%s: %s [%s]", logLevel, formattedDateTime, message);


        try (BufferedWriter writer = new BufferedWriter(new FileWriter(logFilePath, true))) {
            writer.write(logEntry);
            writer.newLine();
            System.out.println("Log entry written: " + logEntry);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
