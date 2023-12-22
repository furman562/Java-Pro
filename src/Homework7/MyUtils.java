package Homework7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyUtils {

    public static int countOccurance(List<String> wordList, String wordToCount) {
        int count = 0;

        for (String word : wordList) {
            if (word.equals(wordToCount)) {
                count++;
            }
        }

        return count;
    }

    public static List<Integer> toList(int[] array) {
        List<Integer> resultList = new ArrayList<>();

        for (int num : array) {
            resultList.add(num);
        }

        return resultList;
    }

    public static List<Integer> findUnique(List<Integer> numberList) {
        List<Integer> uniqueList = new ArrayList<>();

        for (Integer num : numberList) {
            if (!uniqueList.contains(num)) {
                uniqueList.add(num);
            }
        }

        return uniqueList;
    }

    public static void calcOccurance(List<String> wordList) {
        Map<String, Integer> occuranceMap = new HashMap<>();

        for (String word : wordList) {
            occuranceMap.put(word, occuranceMap.getOrDefault(word, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : occuranceMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
