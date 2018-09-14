package string.problems;

import org.testng.Assert;

public class UnitTestingStringProblem {
    public static void main(String[] args) {
        //Apply Unit Test into all the methods in this package.


        Assert.assertEquals(false, Anagram.isAnagram("CAT", "POT"));
        //String str = "Human brain is a biological learning machine";
        Assert.assertEquals("biological", DetermineLargestWord.findTheLargestWord("biological"));
        Assert.assertEquals(true, Palindrome.isPalindrome("Rat"));
        Assert.assertEquals(true, Permutation.permutation1("","XYZ"));

    }
}