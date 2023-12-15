package Homework5;

import static Homework5.ArrayValueCalculator.doCalc;

public class Example {
    public static void main(String[] args) {
        String[][] array = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        try {
            int result = doCalc(array);
            System.out.println("Результат розрахунку: " + result);
        } catch (ArraySizeException | ArrayDataException e) {
            e.printStackTrace();
        }
    }
}
