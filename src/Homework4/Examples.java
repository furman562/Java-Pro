package Homework4;

import java.util.Scanner;

class Examples {
    public static void main(String[] args) {

        SymbolsAndTerms instance = new SymbolsAndTerms();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть рядок ");
        String inputLine = scanner.nextLine();
        System.out.println("Введіть символ для підрахунку ");
        char inputChar = scanner.nextLine().charAt(0);
        int result = instance.find_Symbol_Occurance(inputLine, inputChar);
        System.out.println("Результат " + result);


        System.out.println("Введіть рядок ");
        String inputSource = scanner.nextLine().trim();
        System.out.println("Введіть підрядок, який будемо шукати ");
        String inputTarget = scanner.nextLine().trim();
        int result2 = instance.findWordPosition(inputSource, inputTarget);
        System.out.println(result2);

        System.out.println("Введіть слово для реверсу ");
        String inputLine2 = scanner.nextLine();
        String result3 = instance.stringReverse(inputLine2);
        System.out.println(result3);

        System.out.println("Введіть слово для перевірки ");
        String inputline4 = scanner.nextLine();
        boolean result4 = instance.isPalindrome(inputline4);
        System.out.println("Чи є паліндром " + result4);

        System.out.println();
        instance.playGuessTheWord();
    }
}



