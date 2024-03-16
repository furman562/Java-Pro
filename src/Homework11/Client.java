package Homework11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 8082);

            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            Scanner scanner = new Scanner(System.in);
            System.out.print("Введіть привітання: ");
            String greeting = scanner.nextLine();
            out.println(greeting);

            String response = in.readLine();
            System.out.println("Сервер відповів: " + response);

            if (response.equals("що таке паляниця? ")) {
                System.out.print("Введіть відповідь: ");
                String answer = scanner.nextLine();
                out.println(answer);

                String serverResponse = in.readLine();
                System.out.println(serverResponse);
            }

            in.close();
            out.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
