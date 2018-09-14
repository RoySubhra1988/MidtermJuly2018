package string.problems;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by mrahman on 04/22/17.
 */
public class DuplicateWord {

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";
        Map<String, Integer> map = new HashMap<String, Integer>();
        String[] splitWords = st.split(" ");

        Integer wordCount = 0;
        for (int i = 0; i < splitWords.length; i++) {
            String word = splitWords[i].toUpperCase();    // for case insensitive comparison

            if (map.get(word) == null) {
                map.put(word, wordCount);
            } else {
                System.out.println("Duplicated/Repeated word: " + word);

                map.replace(word, map.get(word) + 1);
                System.out.println("Number of occurrence: " + map.get(word));
            }
        }
        int sum = 0, count = 0;
        for (String str : map.keySet()) {

            if (map.get(str) > 0) {
                sum += str.length();
                count++;
            }

        }
        System.out.println("Average: " + sum / count);

    }
}
