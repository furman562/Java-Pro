package Homework6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class LogReader {

    public static List<String> readFromLogFile(String logFilePath) {
        try {

            return Files.readAllLines(Paths.get(logFilePath));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void filterAndPrintLogMessages(String logFilePath, String logLevel) {
        try {

            List<String> logMessages = Files.readAllLines(Paths.get(logFilePath));


            List<String> filteredMessages = logMessages.stream()
                    .filter(message -> message.contains("[" + logLevel + "]"))
                    .collect(Collectors.toList());

            // Выводим отфильтрованные сообщения
            filteredMessages.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

