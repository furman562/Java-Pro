package Homework7;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "orange", "banana", "apple", "grape", "apple", "orange");
        String wordToCount = "apple";
        int occurrenceCount = MyUtils.countOccurance(words, wordToCount);
        System.out.println("Occurrences of '" + wordToCount + "': " + occurrenceCount);

        int[] intArray = {1, 2, 3, 4, 5};
        List<Integer> intList = MyUtils.toList(intArray);
        System.out.println("List from array: " + intList);

        List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 5, 1, 3);
        List<Integer> uniqueNumbers = MyUtils.findUnique(numbers);
        System.out.println("Unique numbers: " + uniqueNumbers);

        List<String> wordList = Arrays.asList("cat", "dog", "cat", "bird", "dog", "cat", "bird", "cat");
        MyUtils.calcOccurance(wordList);

    }
}
