package string.problems;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DetermineLargestWord {
    public static void main(String[] args) {
        /*
         Implement to Find the length and longest word in the given sentence below.
         Should return "10 biological".
         */
        String s="Human brain is a biological learning machine";
        Map<Integer, String> wordNLength = findTheLargestWord(s);
        //implement
        /*String [] word = s.split(" ");
        String word2 = " ";
        for (int i=0; i<word.length; i++){
            if (word[i].length()>= word2.length()){
                word2=word[i];
            }
        }*/
        int max = 0;
        String word = null;

        for (Map.Entry entry: wordNLength.entrySet()) {
            if ((int)entry.getKey() > max){
                max = (int)entry.getKey();
                word = (String) entry.getValue();
            }
        }
        System.out.println(max +" "+ word + " This is the largest word.");
       /* System.out.println(word2);
        System.out.println(word2.length());
        System.out.println("+++++++++++++++++++++++++");*/
    }

    public static Map<Integer, String> findTheLargestWord(String wordGiven){
        Map<Integer, String> map = new HashMap<Integer, String>();
        String st = "";
        //implement
String [] array = wordGiven.split(" ");
for(String str: array){
    if(map.get(str)==null){
        map.put(str.length(),str);
    }

    System.out.println(str);
    System.out.println(str.length());
}


        return map;
    }
}
