package Homework6;


import java.util.List;


public class LogFileExample {

    public static void main(String[] args) {
        String logFilePath = "/Users/macbook/Desktop/homework/Java-Pro/src/Homework6/log";


        LogWriter.writeToLogFile(logFilePath, "INFO", "Starting JuniorCrudServiceApplication using Java 17.0.7");
        LogWriter.writeToLogFile(logFilePath, "DEBUG", "User admin created");


        List<String> logMessages = LogReader.readFromLogFile(logFilePath);
        System.out.println("All log messages:");
        logMessages.forEach(System.out::println);


        System.out.println("\nFiltered log messages (level: INFO):");
        LogReader.filterAndPrintLogMessages(logFilePath, "INFO");
    }
}
