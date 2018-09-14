package string.problems;

import java.util.Arrays;

/**
 * Created by mrahman on 04/22/17.
 */
public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".
        String var1 = "CAT";
        String var2 = "ACT";
        String var3 = "ARMY";
        String var4 = "MARY";
        String var5 = "XZY";
        String var6 = "XYZ";
        String var7 = "JENY";
        String var8 = "TANU";


        System.out.println(isAnagram(var1,var2));
        System.out.println(isAnagram(var3,var4));
        System.out.println(isAnagram(var1,var4));
        System.out.println(isAnagram(var5,var6));
        System.out.println(isAnagram(var7, var8));
    }

    public static boolean isAnagram(String var1, String var2) {
        char[] firstWord = var1.toCharArray();
        char[] secondWord = var2.toCharArray();
        Arrays.sort(firstWord);
        Arrays.sort(secondWord);
        return Arrays.equals(firstWord,secondWord);
    }
}
