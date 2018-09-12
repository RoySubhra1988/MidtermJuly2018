package math.problems;

import static java.lang.Math.abs;

public class FindLowestDifference {
    public static void main(String[] args) {
        /*
         Implement in java.
         Read this below two array. Find the lowest difference between the two array cell.
        */
        int [] array1 = {30,12,5,9,2,20,33,1};
        int [] array2 = {18,25,41,47,17,36,14,19};

        int low = -1;
        int diff;

        for(int i : array1)
        {
            for(int j : array2)
            {
                diff = abs((i-j));
                if(low == -1)
                {
                    low = diff;
                }

                if(diff < low)
                {
                    low = diff;
                }
            }
        }
        System.out.print(low);
    }


}
