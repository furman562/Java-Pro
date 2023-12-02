package Homework4;

import java.util.Random;
import java.util.Scanner;

public class SymbolsAndTerms {
    public String line;
    public char someChar;
    public String source;
    public String target;
    private Scanner scanner = new Scanner(System.in);
    private Random random = new Random();


    public int find_Symbol_Occurance(String inputLine, char inputChar) {
        this.line = inputLine;
        this.someChar = inputChar;
        int count = 0;

        System.out.println("Маємо рядок " + line);

        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == someChar) {
                count++;
            }
        }
        return count;
    }

    public int findWordPosition(String inputSource, String inputTarget) {
        this.source = inputSource;
        this.target = inputTarget;


        int index = inputSource.indexOf(inputTarget);
        if (index != -1) {
            System.out.println("номер позиції першого елемента підрядка " + inputTarget + " у рядку " + inputSource);
        } else {
            System.out.println("Підрядок " + inputTarget + " в рядку " + inputSource + " не знайдено");
            return -1;
        }
        return index;
    }

    public String stringReverse(String inputLine2) {
        this.line = inputLine2;

        StringBuilder stringBuilder = new StringBuilder(inputLine2);
        stringBuilder.reverse();
        String reverseResult = stringBuilder.toString();
        System.out.println("Результат реверсу слова " + inputLine2);
        return reverseResult;
    }

    public boolean isPalindrome(String inputline4) {
        this.line = inputline4;
        StringBuilder reversed = new StringBuilder(line).reverse();
        return line.equals(reversed.toString());
    }

    public void playGuessTheWord() {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", " pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        String secretWord = words[random.nextInt(words.length)];
        int wordLength = secretWord.length();
        char[] guessedLetters = new char[wordLength];
        boolean wordGuessed = false;

        System.out.println("Вітаю,ти в грі Відгадай слово !");
        System.out.println("Саме час спробувати ...");

        int defaultHashCount = 12;

        while (!wordGuessed) {
            System.out.print("Саме час ввести слово: ");
            String userGuess = scanner.nextLine().toLowerCase();

            if (userGuess.equals(secretWord)) {
                wordGuessed = true;
            } else {
                StringBuilder displayString = new StringBuilder();

                for (int i = 0; i < defaultHashCount; i++) {
                    if (i < wordLength && i < userGuess.length() && userGuess.charAt(i) == secretWord.charAt(i)) {
                        displayString.append(secretWord.charAt(i));
                    } else {
                        displayString.append('#');
                    }
                }

                System.out.println("На жаль, ні! Але є можливість спробувати ще.");
                System.out.println("ще не фінал: " + displayString.toString());
            }

            if (userGuess.equals(secretWord)) {
                System.out.println("Мої вітання! Ти відгадав/ла слово: " + secretWord);
                wordGuessed = true;
            }
        }
    }
}








