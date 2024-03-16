package Homework11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8082);
            System.out.println("Сервер запущено. Очікування підключення клієнта ...");

            Socket clientSocket = serverSocket.accept();
            System.out.println("Клієнт підключений ");

            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

            String greeting = in.readLine();
            System.out.println("Клієнт привітався " + greeting);

            if (greeting.matches(".*[а-яА-ЯЁё].*")) {
                out.println("що таке паляниця? ");

                String answer = in.readLine();
                if (answer.equalsIgnoreCase("хліб")) {
                    out.println("Поточна дата і час " + new java.util.Date());
                    out.println("До побачення");
                } else {
                    out.println("Неправильна відповідь. Клієнт буде відключений");
                    clientSocket.close();
                }

            } else {
                out.println("привіт");
                clientSocket.close();
            }
            in.close();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
